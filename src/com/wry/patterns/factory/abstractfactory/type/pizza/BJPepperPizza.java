package com.wry.patterns.factory.abstractfactory.type.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备" + name + "披萨的原材料！");
    }
}
