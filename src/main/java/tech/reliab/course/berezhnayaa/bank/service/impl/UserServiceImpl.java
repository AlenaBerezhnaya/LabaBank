package tech.reliab.course.berezhnayaa.bank.service.impl;


import tech.reliab.course.berezhnayaa.bank.entity.User;
import tech.reliab.course.berezhnayaa.bank.service.UserService;

public class UserServiceImpl implements UserService{
    private User user;

    @Override
    public User getUser() {
        System.out.printf("\nПОЛУЧЕНИЕ ДАННЫХ ПОЛЬЗОВАТЕЛЯ\n");
        System.out.printf("ФИО пользователя: " + user.fioUser +
                "\nДата рождения: " + user.dateOfBirthUser +
                "\nМесто работы: " + user.placeOfWorkUser +
                "\nЕжемесячный доход: " + user.incomeUser +
                "\nБанки, которыми он пользуется: " + user.banksUser +
                "\nКредитные счета: " + user.creditAccountUser +
                "\nПлатежные счета: " + user.paymentAccountUser +
                "\nКредитный рейтинг для банка: " + user.bankCreditRating);
        return user;
    }

    @Override
    public void addUser(User user) {

        this.user = user;
    }

    @Override
    public void updateUser(User user) {
        this.user.setFioUser(user.getFioUser());
        this.user.setDateOfBirthUser(user.getDateOfBirthUser());
        this.user.setPlaceOfWorkUser(user.getPlaceOfWorkUser());
        this.user.setIncomeUser(user.getIncomeUser());
        this.user.setBanksUser(user.getBanksUser());
        this.user.setCreditAccountUser(user.getCreditAccountUser());
        this.user.setPaymentAccountUser(user.getPaymentAccountUser());
        this.user.setBankCreditRating(user.getBankCreditRating());
        System.out.printf("\nИЗМЕНЕНИЕ ДАННЫХ ПОЛЬЗОВАТЕЛЯ\n");
    }

    @Override
    public void deleteUser() {
        System.out.printf("\nУДАЛЕНИЕ ПОЛЬЗОВАТЕЛЯ:\n");
        this.user = null;
    }

     @Override
    public void showUsers() {
        System.out.println(user.toString());
    }

}
