package com.wry.factory.abstractfactory.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备"+name+"披萨的原材料！");
    }
}
