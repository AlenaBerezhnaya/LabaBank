package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.BankOffice;

public interface BankOfficeService {

    BankOffice getBankOffice();

    void addBankOffice(BankOffice bankOffice);

    void updateBankOffice(BankOffice bankOffice);

    void deleteBankOffice();

}
