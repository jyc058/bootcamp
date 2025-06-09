package com.bootcamp.demo;

public abstract class AccountHolder {
  private String name;
  private String phone;
  private String email;

  public AccountHolder(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  // public / protected/ private, type, method Name() {}
  public String getName() {
    return this.name;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getEmail() {
    return this.email;
  }
}

