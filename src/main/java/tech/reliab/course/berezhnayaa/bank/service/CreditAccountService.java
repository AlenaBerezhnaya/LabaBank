package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.CreditAccount;

public interface CreditAccountService {

    CreditAccount getCreditAccount();

    void addCreditAccount(CreditAccount creditAccount);

    void updateCreditAccount(CreditAccount creditAccount);

    void deleteCreditAccount();

}
