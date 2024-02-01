package com.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
	
	private String patId;
	private String patName;
	private String patEmail;
	private String patAddress;
	private String patMobile;
}
