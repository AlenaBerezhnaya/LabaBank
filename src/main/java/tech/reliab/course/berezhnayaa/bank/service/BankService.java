package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.Bank;

public interface BankService {

    Bank getBank();

    Bank addBank(String name);

    void updateBank(Bank bank);


    void deleteBank();

}
