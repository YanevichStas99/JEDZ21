package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        User user1=new User("Alex",20);
        User user2=new User("Ben",40);
        User user3=new User("Carl",30);
        try {
            PostgreeStorage postgreeStorage=new PostgreeStorage();
            postgreeStorage.removeAll();
            postgreeStorage.addUser(user1);
            postgreeStorage.addUser(user2);
            postgreeStorage.addUser(user3);
            postgreeStorage.removeUser(2);
            postgreeStorage.removeUserByName("Carl");
            postgreeStorage.addUser(user2);
            user2.setAge(38);
            postgreeStorage.updateUser(user2);
            System.out.println(postgreeStorage.getUser(1));
            System.out.println(postgreeStorage.getAllUsers());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
