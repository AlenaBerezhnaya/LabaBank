package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.Employee;

public interface EmployeeService {

    Employee getEmployee();

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee();
}
