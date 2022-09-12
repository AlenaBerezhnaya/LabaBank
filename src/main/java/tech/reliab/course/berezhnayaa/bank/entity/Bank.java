package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.berezhnayaa.bank.utils.RandomGenerator;

import java.util.UUID;

@Getter
@Setter

public class Bank {

    /** Id банка */
    public String idBank;
    /**Имя банка */
    public String nameBank;
    /** Кол-во офисов */
    public int numberOffices;
    /** Кол-во банкоматов */
    public int numberBankAtm;
    /**Кол-во сотрудников */
    public int numberEmployee;
    /** Кол-во клиентов */
    public int numberUser;
    /** Рейтинг */
    public int rateBank;
    /** Всего денег в банке */
    public int allMoneyBank;
    /** Процентная ставка */
    public int interestRateBank;

    public Bank(String nameBank) {
        this.idBank = UUID.randomUUID().toString();
        this.nameBank = nameBank;
        this.numberOffices = 0;
        this.numberBankAtm = 0;
        this.numberEmployee = 0;
        this.numberUser = 0;
        this.rateBank = RandomGenerator.generateInt(1, 100);
        this.allMoneyBank = RandomGenerator.generateAllMoney(1, 1000000);
        this.interestRateBank = RandomGenerator.generateRateUseRating(1, 20, this.rateBank);
    }
}
