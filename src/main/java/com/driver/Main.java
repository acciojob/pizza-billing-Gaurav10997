package com.driver;

public class Main {
  public static void main(String[] args) {
//    DeluxePizza dp = new DeluxePizza(true);
//    System.out.println(dp.getPrice());
//    dp.addTakeaway();
//    dp.addExtraCheese();
//    dp.addTakeaway();
//    System.out.println(dp.getBill());
//
//
//    Pizza p1 = new Pizza(true);
//    p1.addExtraCheese();
//
//    p1.addExtraToppings();
//
//    p1.addTakeaway();
//    System.out.println(p1.getPrice());
//    System.out.println(p1.getBill());
//
//    Pizza p = new Pizza(false);
//    System.out.println(p.getPrice());
//    p.addExtraCheese();
//    p.addExtraToppings();
////    p.addTakeaway();
//    System.out.println(p.getBill());

//    Error:  testprintHelloWorld4  Time elapsed: 0.004 s  <<< FAILURE!
//            org.junit.ComparisonFailure:
//    expected:<[Base Price Of The Pizza: 400
//    Extra Cheese Added: 80
//    Extra Toppings Added: 120
//    Total Price: 600
//]> but was:<[Total Price:400]>

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());

  }
}