package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.PaymentAccount;

public interface PaymentAccountService {

    PaymentAccount getPaymentAccount();

    void addPaymentAccount(PaymentAccount paymentAccount);

    void updatePaymentAccount(PaymentAccount paymentAccount);

    void deletePaymentAccount();

}
