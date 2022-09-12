package tech.reliab.course.berezhnayaa.bank.service.impl;

import tech.reliab.course.berezhnayaa.bank.entity.BankAtm;
import tech.reliab.course.berezhnayaa.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {

    private BankAtm bankAtm;

    @Override
    public BankAtm getBankAtm() {
        System.out.printf("\nПОЛУЧЕНИЕ ДАННЫХ БАНКОМАТА\n");
        System.out.printf("Имя банкомата: " + bankAtm.nameBankAtm +
                "\nАдрес: " + bankAtm.addressBankAtm +
                "\nСтатус (работает/не работает/нет денег): " + bankAtm.statusBankAtm +
                "\nБанк, которому принадлежит банкомат: " + bankAtm.bankBankAtm +
                "\nРасположение банкомата: " + bankAtm.locationBankAtm +
                "\nОбслуживающий сотрудник: " + bankAtm.employeeBankAtm +
                "\nРаботает ли на выдачу денег? (да/нет): " + bankAtm.cashBankAtm +
                "\nМожно ли внести деньги? (да/нет): " + bankAtm.contributeBankAtm +
                "\nКол-во денег в банковском офисе: " + bankAtm.allMoneyBankAtm +
                "\nСтоимость обслуживания банкомата: " + bankAtm.priceBankAtm);
        return bankAtm;
    }

    @Override
    public void addBankAtm(BankAtm bankAtm) {

        this.bankAtm = bankAtm;
    }

    @Override
    public void updateBankAtm(BankAtm bankAtm) {
        this.bankAtm.setNameBankAtm(bankAtm.getNameBankAtm());
        this.bankAtm.setAddressBankAtm(bankAtm.getAddressBankAtm());
        this.bankAtm.setStatusBankAtm(bankAtm.getStatusBankAtm());
        this.bankAtm.setBankBankAtm(bankAtm.getBankBankAtm());
        this.bankAtm.setLocationBankAtm(bankAtm.getLocationBankAtm());
        this.bankAtm.setEmployeeBankAtm(bankAtm.getEmployeeBankAtm());
        this.bankAtm.setCashBankAtm(bankAtm.getCashBankAtm());
        this.bankAtm.setContributeBankAtm(bankAtm.getContributeBankAtm());
        this.bankAtm.setAllMoneyBankAtm(bankAtm.getAllMoneyBankAtm());
        this.bankAtm.setPriceBankAtm(bankAtm.getPriceBankAtm());
    }

    @Override
    public void deleteBankAtm() {

        this.bankAtm = null;
    }
}
