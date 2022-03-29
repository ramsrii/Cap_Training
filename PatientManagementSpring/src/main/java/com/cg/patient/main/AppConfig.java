package com.cg.patient.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cg.patient.model.Patient;
import com.cg.patient.service.PatientService;

@Configuration
@ComponentScan("com.cg.patient")
@PropertySource("classpath:application.properties")
public class AppConfig {
	 @Bean
	    Patient patient() {
	        return new Patient();
	    }

	    @Bean
	    PatientService patientService() {
	        return new PatientService();
	    }

}
