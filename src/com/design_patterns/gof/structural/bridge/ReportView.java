package com.design_patterns.gof.structural.bridge;

import java.io.File;

public interface ReportView {
	
	public void addLine(String line);
	public void addColumn(String column);
	public void addTable(String title);
	public void addChart();
	public void generateReport(File reportFile);

}
