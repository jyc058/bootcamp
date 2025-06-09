package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<Account> accounts;

  private String name;

  public String getName() {
    return this.name;
  }

  public void addAccounts(Account account) {
    this.accounts.add(account);
  }

  public List<Account> vipList(List<Account> accounts) {
    List<Account> vipList1 = new ArrayList<>();
    for (Account account : accounts) {
      if (account.getBalance() > 1000)
      vipList1.add(account);
    }
    return vipList1;
  }
}
