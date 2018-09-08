package com.upperlink.adio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upperlink.adio.dao.ApplicantDao;
import com.upperlink.adio.model.Applicant;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	ApplicantDao applicantDao;
	
	@Override
	@Transactional
	public boolean saveApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		return applicantDao.saveApplicant(applicant);
	}

}
