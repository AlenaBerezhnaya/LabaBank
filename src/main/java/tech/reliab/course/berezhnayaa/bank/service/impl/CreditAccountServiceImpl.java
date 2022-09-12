package tech.reliab.course.berezhnayaa.bank.service.impl;

import tech.reliab.course.berezhnayaa.bank.entity.CreditAccount;
import tech.reliab.course.berezhnayaa.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {

    private CreditAccount creditAccount;

    @Override
    public CreditAccount getCreditAccount() {
        System.out.printf("\nПОЛУЧЕНИЕ КРЕДИТНОГО СЧЕТА\n");
        System.out.printf("Пользователь, за которым закреплен счет: " + creditAccount.userCreditAccount +
                "\nБанк, где взят кредит: " + creditAccount.bankCreditAccount +
                "\nДата начала кредита: " + creditAccount.dateBeginCreditAccount +
                "\nДата окончания кредита: " + creditAccount.dateEndCreditAccount +
                "\nКол-во месяцев, на которые взят кредит: " + creditAccount.monthCreditAccount +
                "\nСумма кредита: " + creditAccount.creditSumCreditAccount +
                "\nЕжемесячный платеж: " + creditAccount.paymentCreditAccount +
                "\nПроцентная ставка: " + creditAccount.interestRateCreditAccount +
                "\nСотрудник, который выдал кредит: " + creditAccount.employeeCreditAccount +
                "\nПлатежный счет в банке для погашения кредита: " + creditAccount.paymentAccountCreditAccount);
        return creditAccount;
    }

    @Override
    public void addCreditAccount(CreditAccount creditAccount) {

        this.creditAccount = creditAccount;
    }

    @Override
    public void updateCreditAccount(CreditAccount creditAccount) {
        this.creditAccount.setUserCreditAccount(creditAccount.getUserCreditAccount());
        this.creditAccount.setBankCreditAccount(creditAccount.getBankCreditAccount());
        this.creditAccount.setDateBeginCreditAccount(creditAccount.getDateBeginCreditAccount());
        this.creditAccount.setDateEndCreditAccount(creditAccount.getDateEndCreditAccount());
        this.creditAccount.setMonthCreditAccount(creditAccount.getMonthCreditAccount());
        this.creditAccount.setCreditSumCreditAccount(creditAccount.getCreditSumCreditAccount());
        this.creditAccount.setPaymentCreditAccount(creditAccount.getPaymentCreditAccount());
        this.creditAccount.setInterestRateCreditAccount(creditAccount.getInterestRateCreditAccount());
        this.creditAccount.setEmployeeCreditAccount(creditAccount.getEmployeeCreditAccount());
        this.creditAccount.setPaymentAccountCreditAccount(creditAccount.getPaymentAccountCreditAccount());

    }

    @Override
    public void deleteCreditAccount() {

        this.creditAccount = null;
    }
}
