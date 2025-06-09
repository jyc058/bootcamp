package com.bootcamp.demo;

public class Transaction implements TransactionInterface {

  public boolean pay(Account a1, double amount, Account a2) {
    if (a1.getBalance() > amount) {
      a1.withdrawl(amount);
      a2.deposit(amount);
      return true;
    }
    return false;
  }
}
