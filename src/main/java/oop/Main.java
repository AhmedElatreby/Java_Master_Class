package oop;

import oop.encapsulation.BankAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Ahmed", BigDecimal.TEN, false);
        System.out.println(account.getBalance());

        System.out.println(account.withdraw(new BigDecimal("9.0")));

        System.out.println(account.getBalance());
        System.out.println(account.withdraw(new BigDecimal("9.0")));

        account.setBalance(new BigDecimal(100_0000));

        System.out.println(account.getBalance());

    }
}
