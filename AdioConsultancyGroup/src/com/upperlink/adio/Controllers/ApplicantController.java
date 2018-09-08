package com.upperlink.adio.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upperlink.adio.model.Applicant;
import com.upperlink.adio.services.ApplicantService;

@Controller
public class ApplicantController {
	
	@Autowired
	ApplicantService applicantService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("/new")
	public String newApplicant(Model model) {
		model.addAttribute("applicant", new Applicant());
		return "applicant-form";
	}

	@RequestMapping("/showAccount")
	public String showApplicant() {
		return "showApplicant";
	}

	@RequestMapping(value = "/saveApplicant", method = RequestMethod.POST)
	public String saveApplicant(@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {

		/*
		 * String acNo = request.getParameter("accountNo"); String customerName =
		 * request.getParameter("accountHolderName"); String balance =
		 * request.getParameter("balance");
		 */

//		model.addAttribute("accountNumber",acNo);
//		model.addAttribute("accountHolderName", customerName);
//		model.addAttribute("balance", balance);

//		Account account = new Account();

//		account.setAccountNo(Integer.parseInt(acNo));
//		account.setAccountHolderName(customerName);
//		account.setBalance(Integer.parseInt(balance));

//		model.addAttribute("account", account);
//		return "showAccount";

		if (result.hasErrors())
			return "account-form";
		else
			applicantService.saveApplicant(applicant);
		return "showApplicantt";
	}
}
