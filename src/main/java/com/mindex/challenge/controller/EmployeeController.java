package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee) {
        LOG.debug("Received employee create request for [{}]", employee);

        return employeeService.create(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee read(@PathVariable String id) {
        LOG.debug("Received employee create request for id [{}]", id);

        return employeeService.read(id);
    }
	

    @PutMapping("/employee/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        LOG.debug("Received employee create request for id [{}] and employee [{}]", id, employee);

        employee.setEmployeeId(id);
        return employeeService.update(employee);
    }

    @GetMapping("/reportingStructure/{id}")
    public ReportingStructure exec(@PathVariable String id) {
        LOG.debug("Received employee create request for id [{}]", id);
		int numberOfReports = employeeService.exec(id,0);
		
		ReportingStructure reportingStructure = new ReportingStructure();

        reportingStructure.setEmployee(employeeService.read(id));
        reportingStructure.setNumberOfReports(numberOfReports);
		return reportingStructure;
    }

    @PostMapping("/compensation")
    public Compensation createComp(@RequestBody Compensation comp) {
        LOG.debug("Received employee create request for [{}]", comp);

        return employeeService.createComp(comp);
    }

	@GetMapping("/compensation/{id}")
    public Compensation readComp(@PathVariable String id) {
        LOG.debug("Received compensation find request for id [{}]", id);

        return employeeService.readComp(id);
    }


}
