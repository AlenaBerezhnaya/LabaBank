package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.BankAtm;

public interface AtmService {

    BankAtm getBankAtm();

    void addBankAtm(BankAtm bankAtm);

    void updateBankAtm(BankAtm bankAtm);

    void deleteBankAtm();
}
