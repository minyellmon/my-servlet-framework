package com.demo;

public class NewYorkPizza extends PizzaTemplate{
    @Override
    public void prepared() {
        System.out.println("NewYork Prepared::");
    }

    @Override
    public void bake() {
        System.out.println("NewYork bake::");

    }

    @Override
    public void topping() {
        System.out.println("NewYork topping::");
    }

    @Override
    public void serve() {
        System.out.println("NewYork serve::");
    }

    @Override
    public void checkBill() {
        System.out.println("NewYork checkBill::");
    }
}
