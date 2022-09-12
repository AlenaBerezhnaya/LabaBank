package tech.reliab.course.berezhnayaa.bank.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // создание конструктора, включающего все возможные поля
@Getter

public enum BankAtmStatusEnum {
    WORK ("Работает"),
    NOTWORK ("Не работает"),
    NOMONEY ("Нет денег");

    private String statusBankAtm;
}