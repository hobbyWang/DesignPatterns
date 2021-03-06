package com.wry.patterns.factory.abstractfactory.type2.factory;

import com.wry.patterns.factory.abstractfactory.type2.keybo.DellKeyboard;
import com.wry.patterns.factory.abstractfactory.type2.keybo.Keyboard;
import com.wry.patterns.factory.abstractfactory.type2.mouse.DellMouse;
import com.wry.patterns.factory.abstractfactory.type2.mouse.Mouse;

/**
 * Dell 工厂
 */
public class DellFactory implements PcFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
