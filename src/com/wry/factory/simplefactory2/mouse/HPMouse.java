package com.wry.factory.simplefactory2.mouse;

/**
 * 惠普的鼠标
 */
public class HPMouse extends Mouse{

    @Override
   public void sayHi() {
        System.out.println("这是HP（惠普）的鼠标");
    }
}