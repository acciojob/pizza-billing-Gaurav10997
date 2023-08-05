package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean addTakeaway;

    public void isAddExtraCheese(boolean flag){
        this.addExtraCheese=flag;
    }
    public void isExtraToppings(boolean flag){
        this.addExtraToppings=flag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)this.price=300;
        else this.price=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.addExtraCheese){
            this.price+=80;
            this.addExtraCheese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.addExtraToppings){
            if(this.isVeg)this.price+=70;
            else this.price+=120;
            this.addExtraToppings=true;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!this.addTakeaway){
            this.price+=20;
            this.addTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill="Total Price:"+  this.getPrice();
        return this.bill;
    }
}
