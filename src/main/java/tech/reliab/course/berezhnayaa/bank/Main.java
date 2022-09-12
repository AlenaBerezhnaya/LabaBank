package tech.reliab.course.berezhnayaa.bank;

import tech.reliab.course.berezhnayaa.bank.entity.*;
import tech.reliab.course.berezhnayaa.bank.enums.BankAtmStatusEnum;
import tech.reliab.course.berezhnayaa.bank.service.*;
import tech.reliab.course.berezhnayaa.bank.service.impl.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /** Создание банка */
        BankServiceImpl banks = new BankServiceImpl();
        Bank bank = banks.addBank("Сбербанк");
        /** Создание офиса банка */
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        BankOffice bankOffice = new BankOffice("Офис новый",
                "улица Ватутина 2",
                BankAtmStatusEnum.WORK,
                true,
                0,
                true,
                true,
                true,
                bank.getAllMoneyBank(),
                2500);
        bank.setNumberOffices(bank.getNumberOffices() + 1);
        /** Создание сотрудника банка */
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new Employee("Петров Петр Петрович",
                LocalDate.of(1998, 11, 11),
                "Консультант",
                bank,
                true,
                bankOffice,
                true,
                2500);
        bank.setNumberEmployee(bank.getNumberEmployee() + 1);
        /** Создание банкомата */
        AtmService atmService = new AtmServiceImpl();
        BankAtm bankAtm = new BankAtm("Банкомат №1",
                "Королева 2",
                BankAtmStatusEnum.WORK,
                bank,
                bankOffice,
                employee,
                true,
                true,
                0,
                2500);
        bank.setNumberBankAtm(bank.getNumberBankAtm() + 1);
        /** Создание пользователя */
       UserService userService = new UserServiceImpl();
        User user = new User("Петров Петр Петрович",
                LocalDate.of(2000, 11, 11),
                "ООО Новые Технологии",
                bank);
        bank.setNumberUser(bank.getNumberUser() + 1);
        /** Создание платежного счета */
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        PaymentAccount paymentAccount = new PaymentAccount(user,
                "Сбербанк");
        paymentAccount.setSumPaymentAccount(user.getIncomeUser());
        user.setPaymentAccountUser(paymentAccount);
        /** Создание кредитного счета */
        CreditAccountService creditAccountService = new CreditAccountServiceImpl();
        CreditAccount creditAccount = new CreditAccount(user,
                bank.getNameBank(),
                LocalDate.of(2020, 11, 11),
                LocalDate.of(2025, 11, 11),
                100,
                200000,
                20000,
                bank.getRateBank(),
                employee,
                paymentAccount);

        bankOfficeService.addBankOffice(bankOffice);
        bankOfficeService.getBankOffice();
        employeeService.addEmployee(employee);
        employeeService.getEmployee();
        atmService.addBankAtm(bankAtm);
        atmService.getBankAtm();
        userService.addUser(user);
        userService.getUser();
        paymentAccountService.addPaymentAccount(paymentAccount);
        paymentAccountService.getPaymentAccount();
        creditAccountService.addCreditAccount(creditAccount);
        creditAccountService.getCreditAccount();
        /** Обновление пользователя по ФИО */
        //user.setFioUser("ТЕСТ ТЕСТ ТЕСТ");
       //userService.updateUser(user);
       // userService.getUser();
    }


}
