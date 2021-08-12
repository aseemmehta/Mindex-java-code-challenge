package com.mindex.challenge.data;

import com.mindex.challenge.data.Employee;
import java.util.List;


public class Compensation {
    private Employee employee;
	private int salary;
	
	private String effectiveDate;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

	public Employee getEmployee() {
        return employee;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }
	
	public int getSalary() {
        return salary;
    }
	
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
	
	public String getEffectiveDate() {
        return effectiveDate;
    }


}
