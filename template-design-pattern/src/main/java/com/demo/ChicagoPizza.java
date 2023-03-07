package com.demo;

public class ChicagoPizza extends PizzaTemplate{

    @Override
    public void prepared() {
        System.out.println("Chicago Prepared::");
    }

    @Override
    public void bake() {
        System.out.println("Chicago bake::");

    }

    @Override
    public void topping() {
        System.out.println("Chicago Topping::");

    }

    @Override
    public void serve() {
        System.out.println("Chicago serve::");

    }

    @Override
    public void checkBill() {
        System.out.println("Chicago checkBill::");

    }
}
