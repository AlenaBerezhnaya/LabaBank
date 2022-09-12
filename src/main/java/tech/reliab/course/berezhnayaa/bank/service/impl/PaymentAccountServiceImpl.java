package tech.reliab.course.berezhnayaa.bank.service.impl;

import tech.reliab.course.berezhnayaa.bank.entity.PaymentAccount;
import tech.reliab.course.berezhnayaa.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService{

    private PaymentAccount paymentAccount;

    @Override
    public PaymentAccount getPaymentAccount() {
        System.out.printf("\nПОЛУЧЕНИЕ ПЛАТЕЖНОГО СЧЕТА\n");
        System.out.printf("Пользователь, за которым закреплен счет: " + paymentAccount.userPaymentAccount +
                "\nБанк, в котором открыт счет: " + paymentAccount.bankPaymentAccount +
                "\nСумма, которая лежит на счету в данный момент: " + paymentAccount.sumPaymentAccount);
        return paymentAccount;
    }

    @Override
    public void addPaymentAccount(PaymentAccount paymentAccount) {

        this.paymentAccount = paymentAccount;
    }

    @Override
    public void updatePaymentAccount(PaymentAccount paymentAccount) {
        this.paymentAccount.setUserPaymentAccount(paymentAccount.getUserPaymentAccount());
        this.paymentAccount.setBankPaymentAccount(paymentAccount.getBankPaymentAccount());
        this.paymentAccount.setSumPaymentAccount(paymentAccount.getSumPaymentAccount());
    }

    @Override
    public void deletePaymentAccount() {
        this.paymentAccount = null;

    }

}
