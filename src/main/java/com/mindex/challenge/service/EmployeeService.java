package com.mindex.challenge.service;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.Compensation;


public interface EmployeeService {
    Employee create(Employee employee);
    Employee read(String id);
    Employee update(Employee employee);
	int exec(String id, int count);
	Compensation createComp(Compensation comp);
	Compensation readComp(String id);

}
