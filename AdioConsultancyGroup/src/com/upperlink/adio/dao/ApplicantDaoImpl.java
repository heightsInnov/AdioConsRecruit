package com.upperlink.adio.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upperlink.adio.model.Applicant;

@Repository
public class ApplicantDaoImpl implements ApplicantDao {

	@Autowired
	saveControl saver;
	
	@Override
	public boolean saveApplicant(Applicant applicant) {
		List<Applicant> lst = new ArrayList<Applicant>();
		boolean saveFlag = true;
		Applicant applicantEntity = new Applicant();
		applicantEntity.setFirstname(applicant.getFirstname());
		applicantEntity.setSurname(applicant.getSurname());
		applicantEntity.setPhoneNo(applicant.getPhoneNo());
		applicantEntity.setEmail(applicant.getEmail());
		
		lst.add(applicantEntity);
		try {
			String saveResp = saver.WriteToFile(lst);
			System.out.println("Response is >>"+ saveResp);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}
}
