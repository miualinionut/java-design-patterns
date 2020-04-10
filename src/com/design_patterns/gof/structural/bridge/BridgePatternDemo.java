package com.design_patterns.gof.structural.bridge;

import java.io.File;

public class BridgePatternDemo {
	
	public static void main(String[] args) { 
		ReportView htmlReportView = new HTMLReportView();
		Report weeklyReport = new WeeklyReport(htmlReportView);
		weeklyReport.generateReport(new File("report.html"));
		
		ReportView pdfReportView = new PDFReportView();
		Report monthlyReport = new MonthlyReport(pdfReportView);
		monthlyReport.generateReport(new File("report.pdf"));
	}

}
