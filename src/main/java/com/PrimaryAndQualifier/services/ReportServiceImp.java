package com.PrimaryAndQualifier.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.PrimaryAndQualifier.dao.ReportDaoI;
@Service
public class ReportServiceImp implements ReportServiceI{
	
	private ReportDaoI reportDoaI;
	
	 
	public ReportServiceImp( @Qualifier("oracle") ReportDaoI reportDoaI) {
		super();
		this.reportDoaI = reportDoaI;
	}


	@Override
	public String ReportGenarated() {
		
		String r = reportDoaI.genrateReportDao();
		return r;
	}
}
