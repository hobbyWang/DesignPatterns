package com.wry.patterns.mediator.type1;

public class SubConcreteMediator extends Mediator {
    @Override
    public void componentChanged(Component component) {
        String componentName = component.getName();
        Component c = componentHashMap.get(componentName);
        if (c == component && component instanceof Button) {
            System.out.println("--单击增加按钮--");
            componentHashMap.get("list").update();
            componentHashMap.get("textBox").update();
            componentHashMap.get("label").update(); //文本标签更新
        } else if (c == component && component instanceof List) {
            System.out.println("--从列表框选择客户--");
            ((List) componentHashMap.get("list")).select();
            ((TextBox) componentHashMap.get("textBox")).setText();
        } else if (c == component && component instanceof List) {
            System.out.println("--从组合框选择客户--");
            ((ComboBox) componentHashMap.get("comboBox")).select();
            ((TextBox) componentHashMap.get("textBox")).setText();
        }

    }
}
