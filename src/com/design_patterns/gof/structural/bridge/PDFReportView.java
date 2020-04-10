package com.design_patterns.gof.structural.bridge;

import java.io.File;

public class PDFReportView implements ReportView {

	@Override
	public void addLine(String line) {
		System.out.println("Adding " + line + " to PDF report view");
	}

	@Override
	public void addColumn(String column) {
		System.out.println("Adding " + column + " to PDF report view");
	}

	@Override
	public void addTable(String title) {
		System.out.println("Creating " + title + " table inside PDF report");
	}

	@Override
	public void addChart() {
		System.out.println("Adding chart  to PDF report view");
	}

	@Override
	public void generateReport(File reportFile) {
		System.out.println("Generate PDF report to " + reportFile.getName());
	}

}
