package com.PrimaryAndQualifier.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("oracle")
public class OracleReportDaoImp implements ReportDaoI{
	
	
	@Override
	public String genrateReportDao() {
		String s="Report Genarated from Oracle DB";
		return s;
	}

}
