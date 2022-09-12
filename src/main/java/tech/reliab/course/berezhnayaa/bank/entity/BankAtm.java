package tech.reliab.course.berezhnayaa.bank.entity;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.berezhnayaa.bank.enums.BankAtmStatusEnum;

import java.util.UUID;

@Setter
@Getter

public class BankAtm {

    /** Id банкомата */
    public String idBankAtm;
    /** Имя банкомата */
    public String nameBankAtm;
    /** Адрес (сопадает с адресом банковского офиса) */
    public String addressBankAtm;
    /** Статус (работает/не работает/нет денег) */
    public BankAtmStatusEnum statusBankAtm;
    /** Банк, которому принадлежит банкомат */
    public Bank bankBankAtm;
    /** Расположение банкомата (банкомат может быть расположен только в банковском офисе) */
    public BankOffice locationBankAtm;
    /** Обслуживающий сотрудник */
    public Employee employeeBankAtm;
    /** Работает ли на выдачу денег? (да/нет) */
    public Boolean cashBankAtm;
    /** Можно ли внести деньги? (да/нет) */
    public Boolean contributeBankAtm;
    /** Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке) */
    public int allMoneyBankAtm;
    /** Стоимость обслуживания банкомата */
    public int priceBankAtm;

    public BankAtm(String nameBankAtm,
                   String addressBankAtm,
                   BankAtmStatusEnum statusBankAtm,
                   Bank bankBankAtm,
                   BankOffice locationBankAtm,
                   Employee employeeBankAtm,
                   Boolean cashBankAtm,
                   Boolean contributeBankAtm,
                   int allMoneyBankAtm,
                   int priceBankAtm) {
        this.idBankAtm = UUID.randomUUID().toString();
        this.nameBankAtm = nameBankAtm;
        this.addressBankAtm = addressBankAtm;
        this.statusBankAtm = statusBankAtm;
        this.bankBankAtm = bankBankAtm;
        this.locationBankAtm = locationBankAtm;
        this.employeeBankAtm = employeeBankAtm;
        this.cashBankAtm = cashBankAtm;
        this.contributeBankAtm = contributeBankAtm;
        this.allMoneyBankAtm = allMoneyBankAtm;
        this.priceBankAtm = priceBankAtm;
    }
}
