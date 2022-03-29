package com.cg.patient.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.patient.service.PatientService;

public class Main {
	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(com.cg.patient.main.AppConfig.class);
		 PatientService patientService = context.getBean(PatientService.class);
	     patientService.getPatientDetails();
	}

}
