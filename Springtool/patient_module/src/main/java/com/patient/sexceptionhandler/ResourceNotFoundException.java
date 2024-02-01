package com.patient.sexceptionhandler;

public class ResourceNotFoundException extends RuntimeException {
 public ResourceNotFoundException(String message) {
	super (message);
}
}
