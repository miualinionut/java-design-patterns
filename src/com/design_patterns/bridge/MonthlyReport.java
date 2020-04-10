package com.design_patterns.bridge;

import java.io.File;

public class MonthlyReport implements Report {
	private ReportView view;
	
	public MonthlyReport(ReportView view) {
		this.view = view;
	}

	@Override
	public void generateReport(File reportFile) {
		view.addTable("Monthly Report");
		view.addLine("Header");
		view.addColumn("Client");
		view.addColumn("Balance");
		view.addLine("Line1");
		view.addColumn("Michael Walters");
		view.addColumn("6500.00");
		view.generateReport(reportFile);

	}

	public ReportView getView() {
		return view;
	}

}
