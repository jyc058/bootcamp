package com.bootcamp.demo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Calculator {

  public Calculator() {

  }

  // Method A -> Method B -> C -> D -> E -> F

  // Developer B
  public int sum(int x, int y) {
    return x + y;
  }

  public boolean sendEmail(String userID, String password, String emailAddress) {
    return false;
  }

  public static Optional<Dog> findTargetDog(List<Dog> dogs, double superpower,
      String name, double weight, int age) {
    for (Dog dog : dogs) {
      if (dog.equals(new Dog(superpower, name, weight, age))) {
        return Optional.of(dog);
      }
    }
    return Optional.empty();
  }
}