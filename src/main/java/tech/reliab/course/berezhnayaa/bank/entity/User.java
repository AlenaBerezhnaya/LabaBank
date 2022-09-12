package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.berezhnayaa.bank.utils.RandomGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class User {

    /** Id клиента */
    public String idUser;
    /** ФИО */
    public String fioUser;
    /** Дата рождения */
    public LocalDate dateOfBirthUser;
    /** Место работы */
    public String placeOfWorkUser;
    /** Ежемесячный доход */
    public int incomeUser;
    /** Банки, которыми он пользуется */
    public Bank banksUser;
    /** Кредитные счета */
    public CreditAccount creditAccountUser;
    /** Платежные счета */
    public PaymentAccount paymentAccountUser;
    /** Кредитный рейтинг для банка */
    public int bankCreditRating;

    public User(String fioUser,
                LocalDate dateOfBirthUser,
                String placeOfWorkUser,
                Bank banksUser) {
        this.idUser = UUID.randomUUID().toString();
        this.fioUser = fioUser;
        this.dateOfBirthUser = dateOfBirthUser;
        this.placeOfWorkUser = placeOfWorkUser;
        this.incomeUser = RandomGenerator.generateInt(1, 10000);
        this.banksUser = banksUser;
        this.creditAccountUser = null;
        this.paymentAccountUser = null;
        this.bankCreditRating = RandomGenerator.generateCreditRating(RandomGenerator.generateInt(1, 10000));
    }

}