package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter

public class Employee {

    /** Id сотрудника */
    public String idEmployee;
    /** ФИО */
    public String fioEmployee;
    /** Дата рождения */
    public LocalDate dateOfBirthEmployee;
    /** Должность */
    public String jobTitleEmployee;
    /** В каком банке работает */
    public Bank bankEmployee;
    /** Работает ли в банковском офисе или удаленно? (да/нет) */
    public Boolean optionEmployee;
    /** Банковский офис, в котором работает */
    public BankOffice officeEmployee;
    /** Может ли выдавать кредиты? (да/нет) */
    public Boolean creditEmployee;
    /** Размер зарплаты */
    public int salaryEmployee;

    public Employee(String fioEmployee,
                    LocalDate dateOfBirthEmployee,
                    String jobTitleEmployee,
                    Bank bankEmployee,
                    Boolean optionEmployee,
                    BankOffice officeEmployee,
                    Boolean creditEmployee,
                    int salaryEmployee) {
        this.idEmployee = UUID.randomUUID().toString();
        this.fioEmployee = fioEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.jobTitleEmployee = jobTitleEmployee;
        this.bankEmployee = bankEmployee;
        this.optionEmployee = optionEmployee;
        this.officeEmployee = officeEmployee;
        this.creditEmployee = creditEmployee;
        this.salaryEmployee = salaryEmployee;
    }
}
