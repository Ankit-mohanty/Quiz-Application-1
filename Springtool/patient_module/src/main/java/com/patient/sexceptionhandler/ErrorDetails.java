package com.patient.sexceptionhandler;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDetails {
private Date timeStampDate;
private String details;
private String message;
}
