package com.PrimaryAndQualifier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.PrimaryAndQualifier.services.ReportServiceI;

@RestController
public class ReportController {

	@Autowired
	private ReportServiceI reportServiceI;
	
	public void generatedReport() {
		 System.out.println(reportServiceI.ReportGenarated());
	}
}
