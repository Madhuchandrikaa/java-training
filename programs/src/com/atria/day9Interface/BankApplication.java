package com.atria.day9Interface;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new BankImp1();

        Account acc1 = new Account(101, "Madhu", 5000, bank);

        System.out.println(acc1);

        acc1.deposit(2000);   // valid
        acc1.withdraw(1500);  // valid
        acc1.withdraw(6000);  // should fail (insufficient balance)

        System.out.println(acc1);
    }
}
