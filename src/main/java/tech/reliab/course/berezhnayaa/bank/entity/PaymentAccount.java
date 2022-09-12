package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class PaymentAccount {

    /** Id платёжного счета */
    public String idPaymentAccount;
    /** Пользователь, за которым закреплен этот платежный счет */
    public User userPaymentAccount;
    /** Название банка, в котором открыт этот счет */
    public String bankPaymentAccount;
    /** Сумма, которая лежит в данный момент на счету */
    public int sumPaymentAccount;

    public PaymentAccount(User user,
                          String nameBank) {
        this.idPaymentAccount = UUID.randomUUID().toString();
        this.userPaymentAccount = user;
        this.bankPaymentAccount = nameBank;
        this.sumPaymentAccount = 0;
    }
}
