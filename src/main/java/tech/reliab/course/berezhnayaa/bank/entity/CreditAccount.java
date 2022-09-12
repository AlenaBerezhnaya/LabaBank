package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
public class CreditAccount {

    /** Id кредитного счета */
    public String idCreditAccount;
    /** Пользователь, за которым закреплен этот кредитный счет */
    public User userCreditAccount;
    /** Название банка, где взят кредит */
    public String bankCreditAccount;
    /** Дата начала кредита */
    public LocalDate dateBeginCreditAccount;
    /** Дата окончания кредита */
    public LocalDate dateEndCreditAccount;
    /** Кол-во месяцев, на которые взят кредит */
    public int monthCreditAccount;
    /** Сумма кредита */
    public int creditSumCreditAccount;
    /** Ежемесячный платеж */
    public int paymentCreditAccount;
    /** Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже) */
    public int interestRateCreditAccount;
    /** Сотрудник, который выдал кредит */
    public Employee employeeCreditAccount;
    /** Платежный счет в банке с которого будет осуществляться погашение данного кредита */
    public PaymentAccount paymentAccountCreditAccount;


    public CreditAccount(User userCreditAccount,
                         String bankCreditAccount,
                         LocalDate dateBeginCreditAccount,
                         LocalDate dateEndCreditAccount,
                         int monthCreditAccount,
                         int creditSumCreditAccount,
                         int paymentCreditAccount,
                         int interestRateCreditAccount,
                         Employee employeeCreditAccount,
                         PaymentAccount paymentAccountCreditAccount) {
        this.idCreditAccount = UUID.randomUUID().toString();
        this.userCreditAccount = userCreditAccount;
        this.bankCreditAccount = bankCreditAccount;
        this.dateBeginCreditAccount = dateBeginCreditAccount;
        this.dateEndCreditAccount = dateEndCreditAccount;
        this.monthCreditAccount = monthCreditAccount;
        this.creditSumCreditAccount = creditSumCreditAccount;
        this.paymentCreditAccount = paymentCreditAccount;
        this.interestRateCreditAccount = interestRateCreditAccount;
        this.employeeCreditAccount = employeeCreditAccount;
        this.paymentAccountCreditAccount = paymentAccountCreditAccount;
    }
}
