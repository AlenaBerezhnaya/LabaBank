package tech.reliab.course.berezhnayaa.bank.service.impl;

import tech.reliab.course.berezhnayaa.bank.entity.Employee;
import tech.reliab.course.berezhnayaa.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

    private Employee employee;

    @Override
    public Employee getEmployee() {
        System.out.printf("\nПОЛУЧЕНИЕ ДАННЫХ СОТРУДНИКА\n");
        System.out.printf("ФИО сотрудника: " + employee.fioEmployee +
                "\nДата рождения: " + employee.dateOfBirthEmployee +
                "\nДолжность: " + employee.jobTitleEmployee +
                "\nВ каком банке работает: " + employee.bankEmployee +
                "\nРаботает в банковском офисе или удаленно: " + employee.optionEmployee +
                "\nБанковский офис, в котором работает: " + employee.officeEmployee +
                "\nМожет ли выдавать кредиты?: " + employee.creditEmployee +
                "\nРазмер зарплаты: " + employee.salaryEmployee);
        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {

        this.employee = employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        this.employee.setFioEmployee(employee.getFioEmployee());
        this.employee.setDateOfBirthEmployee(employee.getDateOfBirthEmployee());
        this.employee.setJobTitleEmployee(employee.getJobTitleEmployee());
        this.employee.setBankEmployee(employee.getBankEmployee());
        this.employee.setOptionEmployee(employee.getOptionEmployee());
        this.employee.setOfficeEmployee(employee.getOfficeEmployee());
        this.employee.setCreditEmployee(employee.getCreditEmployee());
        this.employee.setSalaryEmployee(employee.getSalaryEmployee());

    }

    @Override
    public void deleteEmployee() {
        this.employee = null;
    }
}


