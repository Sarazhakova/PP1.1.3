package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserServiceImpl userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 30);
        userService.saveUser("Andrey", "Smirnov", (byte) 26);
        userService.saveUser("Galina", "Petrova", (byte) 29);
        userService.saveUser("Maria", "Sergeeva", (byte) 31);

        userService.cleanUsersTable();

        userService.getAllUsers();

        userService.dropUsersTable();
    }
}
