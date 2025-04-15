package com.gevernova.inheritance.restaurant;

public class Chef extends Person implements Worker{
    String performDuties;
    public Chef(String name, int age, String duties){
        this.name=name;
        this.age=age;
        this.performDuties=duties;
    }
    @Override
    public void implementsDuties() {
        System.out.println(name + " performs " + performDuties +" at age "+ age);
    }
}
