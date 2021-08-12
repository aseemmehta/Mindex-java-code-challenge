package com.mindex.challenge.data;

import java.util.List;

public class ReportingStructure {
    private Employee employee;
	private int numberOfReports;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

	public Employee getEmployee() {
        return employee;
    }


    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }
	
	public int getNumberOfReports() {
        return numberOfReports;
    }


}
