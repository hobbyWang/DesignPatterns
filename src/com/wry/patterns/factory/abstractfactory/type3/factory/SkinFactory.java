package com.wry.patterns.factory.abstractfactory.type3.factory;

import com.wry.patterns.factory.abstractfactory.type3.product.*;

//界面皮肤工厂接口：抽象工厂
public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}

