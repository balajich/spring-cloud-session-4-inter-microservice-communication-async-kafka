package org.eduami.spring.restapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eduami.spring.restapi.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PayrollController {
    private Log logger = LogFactory.getLog(PayrollController.class);

    // Initialize database
    private static final Map<Integer, Employee> dataBase = new HashMap<>();

    static {
        dataBase.put(100, new Employee(100, 65000));
        dataBase.put(101, new Employee(101, 90000));
    }


    @RequestMapping(value = "/payroll/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable int employeeId) {
        logger.info(String.format("Getting Payroll Details of Employee with id %s", employeeId));
        return dataBase.get(employeeId);
    }

}
