package com.bootcamp.demo;

public class Person extends AccountHolder {
  private Gender gender;
  public static enum Gender {
    Male, Female;
  }

  public Person(String name, String phone, String email) {
    super(name, phone, email);
  }

  public Gender getGender() {
    return this.gender;
  }

  
}
