package com.example.sd18104.repository;

import com.example.sd18104.entity.Account;

public class AccountRepository {

    public static Account[] accounts = new Account[]{
            new Account("user", "123", "User"),
            new Account("admin", "321", "Admin")
    };


    public Account getByUsername(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }
}
