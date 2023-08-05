package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.isAddExtraCheese(true);
        this.isExtraToppings(true);
        // your code goes here
    }
}
