package com.design_patterns.bridge;

import java.io.File;

public class HTMLReportView implements ReportView {

	@Override
	public void addLine(String line) {
		System.out.println("Adding " + line + " to HTML report view");
	}

	@Override
	public void addColumn(String column) {
		System.out.println("Adding " + column + " to HTML report view");
	}

	@Override
	public void addTable(String title) {
		System.out.println("Creating " + title + " table inside HTML report");
	}

	@Override
	public void addChart() {
		System.out.println("Adding chart to HTML report view");
	}

	@Override
	public void generateReport(File reportFile) {
		System.out.println("Generate HTML report to " + reportFile.getName());
	}

}
