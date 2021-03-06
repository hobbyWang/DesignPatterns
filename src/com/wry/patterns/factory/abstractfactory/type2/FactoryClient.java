package com.wry.patterns.factory.abstractfactory.type2;

import com.wry.patterns.factory.abstractfactory.type2.factory.DellFactory;
import com.wry.patterns.factory.abstractfactory.type2.factory.HPFactory;
import com.wry.patterns.factory.abstractfactory.type2.factory.PcFactory;
import com.wry.patterns.factory.abstractfactory.type2.keybo.Keyboard;
import com.wry.patterns.factory.abstractfactory.type2.mouse.Mouse;


public class FactoryClient {
    public static void main(String[] args) {
        //Dell
        Mouse mouse = getMouse(new DellFactory());
        mouse.sayHi();
        Keyboard keyboard = getKeyboard(new DellFactory());
        keyboard.sayHi();

        //HP
        Mouse mouse2 = getMouse(new HPFactory());
        mouse2.sayHi();
        Keyboard keyboard2 = getKeyboard(new HPFactory());
        keyboard2.sayHi();
    }

    /**
     * 获取鼠标实例
     *
     * @param pcFactory
     * @return
     */
    public static Mouse getMouse(PcFactory pcFactory) {
        Mouse mouse = pcFactory.createMouse();
        return mouse;
    }

    /**
     * 获取键盘实例
     *
     * @param pcFactory
     * @return
     */
    public static Keyboard getKeyboard(PcFactory pcFactory) {
        Keyboard keyboard = pcFactory.createKeyboard();
        return keyboard;
    }
}
