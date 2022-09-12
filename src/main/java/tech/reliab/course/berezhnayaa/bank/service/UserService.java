package tech.reliab.course.berezhnayaa.bank.service;

import tech.reliab.course.berezhnayaa.bank.entity.User;

public interface UserService {

    User getUser();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser();

    void showUsers();

}
