package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());


    Pizza p1 = new Pizza(true);
    p1.addExtraCheese();

    p1.addExtraToppings();

    p1.addTakeaway();
    System.out.println(p1.getPrice());
    System.out.println(p1.getBill());

    Pizza p = new Pizza(false);
    System.out.println(p.getPrice());
    p.addExtraCheese();
    p.addExtraToppings();
//    p.addTakeaway();
    System.out.println(p.getBill());

  }
}