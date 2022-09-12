package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.berezhnayaa.bank.enums.BankAtmStatusEnum;

import java.util.UUID;

@Getter
@Setter

public class BankOffice {

    /** Id банковского офиса */
    public String idBankOffice;
    /** Название офиса */
    public String nameBankOffice;
    /** Адрес банковского офиса */
    public String addressBankOffice;
    /** Статус (работает/не работает) */
    public BankAtmStatusEnum statusBankOffice;
    /** Можно ли разместить банкомат? (да/нет) */
    public Boolean bankBankAtmOffice;
    /** Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка) */
    public int bankAtmOffice;
    /** Можно ли оформить кредит в данном офисе? (да/нет) */
    public Boolean creditBankOffice;
    /** Работает ли на выдачу денег? (да/нет) */
    public Boolean cashBankOffice;
    /** Можно ли внести деньги? (да/нет) */
    public Boolean contributeBankOffice;
    /** Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег в банке) */
    public int allMoneyBankOffice;
    /** Стоимость аренды банковского офиса */
    public int priceOfficeBankOffice;

    public BankOffice(String nameBankOffice,
                      String addressBankOffice,
                      BankAtmStatusEnum statusBankOffice,
                      Boolean bankBankAtmOffice,
                      int bankAtmOffice,
                      Boolean creditBankOffice,
                      Boolean cashBankOffice,
                      Boolean contributeBankOffice,
                      int allMoneyBankOffice,
                      int priceOfficeBankOffice) {
        this.idBankOffice = UUID.randomUUID().toString();
        this.nameBankOffice = nameBankOffice;
        this.addressBankOffice = addressBankOffice;
        this.statusBankOffice = statusBankOffice;
        this.bankBankAtmOffice = bankBankAtmOffice;
        this.bankAtmOffice = bankAtmOffice;
        this.creditBankOffice = creditBankOffice;
        this.cashBankOffice = cashBankOffice;
        this.contributeBankOffice = contributeBankOffice;
        this.allMoneyBankOffice = allMoneyBankOffice;
        this.priceOfficeBankOffice = priceOfficeBankOffice;
    }
}
