package tech.reliab.course.berezhnayaa.bank.service.impl;

import tech.reliab.course.berezhnayaa.bank.entity.Bank;
import tech.reliab.course.berezhnayaa.bank.service.BankService;

public class BankServiceImpl implements BankService {

    public Bank bank;

    @Override
    public Bank getBank() {
        System.out.printf("\nПОЛУЧЕНИЕ ДАННЫХ БАНКА\n");
        System.out.printf("Имя банка: " + bank.nameBank +
                "\nКол-во офисов: " + bank.numberOffices +
                "\nКол-во банкоматов: " + bank.numberBankAtm +
                "\nКол-во сотрудников: " + bank.numberEmployee +
                "\nКол-во клиентов: " + bank.numberUser +
                "\nРейтинг: " + bank.rateBank +
                "\nВсего денег в банке: " + bank.allMoneyBank +
                "\nПроцентная ставка: " + bank.interestRateBank);
        return bank;
    }

    @Override
    public Bank addBank(String name) {
        this.bank = new Bank(name);
        return this.bank;
    }

    @Override
    public void updateBank(Bank bank) {
        this.bank.setNameBank(bank.getNameBank());
        this.bank.setNumberOffices(bank.getNumberOffices());
        this.bank.setNumberBankAtm(bank.getNumberBankAtm());
        this.bank.setNumberEmployee(bank.getNumberEmployee());
        this.bank.setNumberUser(bank.getNumberUser());
        this.bank.setRateBank(bank.getRateBank());
        this.bank.setAllMoneyBank(bank.getAllMoneyBank());
        this.bank.setInterestRateBank(bank.getInterestRateBank());
    }

    @Override
    public void deleteBank() {

        this.bank = null;
    }
}
