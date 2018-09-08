package com.upperlink.adio.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.upperlink.adio.model.Applicant;

public class saveControl implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String WriteToFile(List<Applicant> app){
		String resp = "";
		
		try {
			FileOutputStream f = new FileOutputStream(new File("C:\\Users\\aojinadu\\Documents\\NetBeansProjects\\AdioConsultancyCareer\\web\\Uploads\\Applicants.txt.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(app);

			o.close();
			f.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} 
		return resp;
	}
	
	public List<Applicant> ReadFiles(){
		List<Applicant> lst = new ArrayList<>();
		try {
			FileInputStream fi = new FileInputStream(new File("C:\\Users\\aojinadu\\Documents\\NetBeansProjects\\AdioConsultancyCareer\\web\\Uploads\\Applicants.txt.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			@SuppressWarnings("unchecked")
			List<Applicant> pr1 = (List<Applicant>) oi.readObject();

			System.out.println(pr1.toString());

			oi.close();
			fi.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}
}
