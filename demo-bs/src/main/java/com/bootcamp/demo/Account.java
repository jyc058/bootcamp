package com.bootcamp.demo;

import java.math.BigDecimal;

public abstract class Account {
  private AccountHolder holder;
  private double balance;
  private int id;

  public AccountHolder getHolder() {
    return this.holder;
  }

  public double getBalance() {
    return this.balance;
  }

  public int getId() {
    return this.id;
  }

 public void deposit(double amount) {
  this.balance = BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue();
 }

 public boolean withdrawl(double amount) {
  if (amount > this.balance) {
    return false;
  }
 this.balance = BigDecimal.valueOf(this.balance).subtract(BigDecimal.valueOf(amount)).doubleValue();
 return true;
 }

   public boolean isVIP(Account account) {
    if (account.getBalance() > 1000) {
      return true;
    }
    return false;
  }

 public static void main(String[] args) {
  Account a1 = new CustomerAccount();
  a1.deposit(1000);
  System.out.println(a1.getBalance());
 }
}
