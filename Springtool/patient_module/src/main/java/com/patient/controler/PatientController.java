package com.patient.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patient.entity.Patient;
import com.patient.service.PatService;

//import com.netflix.discovery.converters.Auto;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PatientController {
@Autowired
private PatService patService;
@PostMapping("/insert")
public Patient create(@RequestBody Patient patient) {
	return patService.create(patient);
}
@PutMapping("/update/{patId}")
public Patient updatePatient(@PathVariable String patId,@RequestBody Patient patient) {
	return patService.updatePatient(patId, patient);
}
@GetMapping("/alldata")
public List<Patient>getAll(){
	List<Patient> all=
}
}
