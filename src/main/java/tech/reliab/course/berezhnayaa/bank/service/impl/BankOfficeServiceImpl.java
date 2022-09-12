package tech.reliab.course.berezhnayaa.bank.service.impl;

import tech.reliab.course.berezhnayaa.bank.entity.BankOffice;
import tech.reliab.course.berezhnayaa.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService{

    private BankOffice bankOffice;

    @Override
    public BankOffice getBankOffice() {
        System.out.printf("\nПОЛУЧЕНИЕ ДАННЫХ ОФИСА БАНКА\n");
        System.out.printf("Название офиса: " + bankOffice.nameBankOffice +
                "\nАдрес банковского офиса: " + bankOffice.addressBankOffice +
                "\nСтатус (работает/не работает): " + bankOffice.statusBankOffice +
                "\nМожно ли разместить банкомат? (да/нет): " + bankOffice.bankBankAtmOffice +
                "\nКол-во банкоматов в данном офисе: " + bankOffice.bankAtmOffice +
                "\nМожно ли оформить кредит в данном офисе? (да/нет): " + bankOffice.creditBankOffice +
                "\nРаботает ли на выдачу денег? (да/нет): " + bankOffice.cashBankOffice +
                "\nМожно ли внести деньги? (да/нет): " + bankOffice.contributeBankOffice +
                "\nКол-во денег в банковском офисе: " + bankOffice.allMoneyBankOffice +
                "\nСтоимость аренды банковского офиса: " + bankOffice.priceOfficeBankOffice);
        return bankOffice;
    }

    @Override
    public void addBankOffice(BankOffice bankOffice) {

        this.bankOffice = bankOffice;
    }

    @Override
    public void updateBankOffice(BankOffice bankOffice) {
        this.bankOffice.setNameBankOffice(bankOffice.getNameBankOffice());
        this.bankOffice.setAddressBankOffice(bankOffice.getAddressBankOffice());
        this.bankOffice.setStatusBankOffice(bankOffice.getStatusBankOffice());
        this.bankOffice.setBankBankAtmOffice(bankOffice.getBankBankAtmOffice());
        this.bankOffice.setBankAtmOffice(bankOffice.getBankAtmOffice());
        this.bankOffice.setCreditBankOffice(bankOffice.getCreditBankOffice());
        this.bankOffice.setCashBankOffice(bankOffice.getCashBankOffice());
        this.bankOffice.setContributeBankOffice(bankOffice.getContributeBankOffice());
        this.bankOffice.setAllMoneyBankOffice(bankOffice.getAllMoneyBankOffice());
        this.bankOffice.setPriceOfficeBankOffice(bankOffice.getPriceOfficeBankOffice());

    }

    @Override
    public void deleteBankOffice() {

        this.bankOffice = null;
    }
}
