package com.design_patterns.bridge;

import java.io.File;

public class WeeklyReport implements Report {
	private ReportView view;
	
	public WeeklyReport(ReportView view) {
		this.view = view;
	}
 
	@Override
	public void generateReport(File reportFile) {
		view.addTable("Weekly Report");
		view.addLine("Header");
		view.addColumn("Client");
		view.addColumn("Balance");
		view.addLine("Line1");
		view.addColumn("John Smith");
		view.addColumn("3300.00");
		view.generateReport(reportFile);
	}

	public ReportView getView() {
		return view;
	}

}
