package com.receivablesreport.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import com.receivablesreport.model.AccountReceivablesReport;
import  com.receivablesreport.utils.Utilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
@Service
public class  ReceivablesReportService{
    	
      
	public String exportReport(String reportFormat,AccountReceivablesReport accountReceivablesReport) throws FileNotFoundException, JRException {

		String path = "/home/jackline/Desktop/Reports/";

		// Load the report template

		List<AccountReceivablesReport> accountReceivablesReports = new ArrayList<AccountReceivablesReport>();
		accountReceivablesReports.add(accountReceivablesReport);

		File file = ResourceUtils.getFile("classpath:Account_Receivables_Parent.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(accountReceivablesReports);
		Map<String, Object> parameters = new HashMap<>();
		
		JRBeanCollectionDataSource dataSourceHeader = new JRBeanCollectionDataSource(accountReceivablesReports);
		parameters.put("HEADER_DATASOURCE", dataSourceHeader);
		
		JRBeanCollectionDataSource dataSourceDebtorsItems = new JRBeanCollectionDataSource(accountReceivablesReports);
		parameters.put("DEBTORS_ITEMS_DATASOURCE", dataSourceDebtorsItems);
		
		JRBeanCollectionDataSource dataSourceAccountReceivables = new JRBeanCollectionDataSource(accountReceivablesReports);
		parameters.put("ACCOUNT_RECEIVABLES_DATASOURCE", dataSourceAccountReceivables);
		
		parameters.put("createdBy", "Jackline");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		if (reportFormat.equalsIgnoreCase("xml")) {
			return JasperExportManager.exportReportToXml(jasperPrint);

		}

		else if (reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + Utilities.getCurrentDateTime());

		}

		return "report generated in path: " + path;
	}


}


