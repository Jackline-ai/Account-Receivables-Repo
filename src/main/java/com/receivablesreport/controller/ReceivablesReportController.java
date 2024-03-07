package com.receivablesreport.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.receivablesreport.model.AccountReceivablesReport;
import com.receivablesreport.model.ApiResponse;
import com.receivablesreport.service.ReceivablesReportService;

import net.sf.jasperreports.engine.JRException;
@RestController
@RequestMapping("/api")
public class ReceivablesReportController {
	@Autowired
	ReceivablesReportService receivablesReportService;
	
	@PostMapping("/receivables-report")
	public ResponseEntity<ApiResponse> saveEtimsData(@RequestBody AccountReceivablesReport accountReceivablesReport) {
		ApiResponse response = new ApiResponse("Invoice printed successfully", 200);
		
		try {
			receivablesReportService.exportReport("pdf", accountReceivablesReport);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok(response);
	}
}
