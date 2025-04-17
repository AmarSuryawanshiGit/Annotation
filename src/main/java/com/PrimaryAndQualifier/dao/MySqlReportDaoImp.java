package com.PrimaryAndQualifier.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mysql")
public class MySqlReportDaoImp implements ReportDaoI{

	@Override
	public String genrateReportDao() {
		String s="Report Genarated from MySql DB";
		return s;
	}

}
