package com.wry.patterns.proxy.staticproxy.type2;

/**
 * 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void display() {
        System.out.println("访问真实主题方法...");
    }
}
