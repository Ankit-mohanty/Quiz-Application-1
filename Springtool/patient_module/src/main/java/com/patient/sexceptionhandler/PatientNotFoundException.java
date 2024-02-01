package com.patient.sexceptionhandler;

public class PatientNotFoundException extends RuntimeException {
public PatientNotFoundException(String message) {
	super(message);
}
}
