package com.wry.factory.simplefactory.pizzafactory;

import com.wry.factory.simplefactory.pizza.CheessPizza;
import com.wry.factory.simplefactory.pizza.GreekPizza;
import com.wry.factory.simplefactory.pizza.PepperPizza;
import com.wry.factory.simplefactory.pizza.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String pizzaType){
        Pizza pizza=null;
        if (pizzaType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊");
        }
        else if (pizzaType.equals("cheess")){
            pizza=new CheessPizza();
            pizza.setName("奶酪");
        }  else if (pizzaType.equals("pepper")){
            pizza=new PepperPizza();
            pizza.setName("胡椒");
        }
        return pizza;
    }
}
