package com.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.entity.Patient;
import com.patient.repo.PatientRepo;
import com.patient.sexceptionhandler.ResourceNotFoundException;

//import lombok.RequiredArgsConstructor;



@Service
//@RequiredArgsConstructor
public class PatService {
	
@Autowired
private  PatientRepo patientRepo;

public Patient create(Patient patient) {
	Patient savep=patientRepo.save(patient);
	return savep;
}
public Patient updatePatient(String patId, Patient patient) {
 	Patient patientId=patientRepo.findById(patId).orElseThrow(()->new ResourceNotFoundException("not found"));
 	patientId.setPatName(patient.getPatName());
 	patientId.setPatEmail(patient.getPatEmail());
 	patientId.setPatMobile(patient.getPatMobile());
 	Patient updatePat= patientRepo.save(patientId);
 	return updatePat;
}
	public List<Patient> getAllPatient(){
		List<Patient> getall=patientRepo.findAll();
		return getall;
	}
	public Patient getById(String patId) {
		Patient byID=patientRepo.findById(patId).orElseThrow(()->new ResourceNotFoundException("not found"));
		return byID;
	}
	public void deleteById (String patId) {
		patientRepo.deleteById(patId);
		
	}
}

