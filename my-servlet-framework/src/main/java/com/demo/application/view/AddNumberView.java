package com.demo.application.view;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class AddNumberView implements View {
    @Override
    public String render(Model model) {
        int num1=Integer.parseInt(model.get("num1"));
        int num2=Integer.parseInt(model.get("num1"));

        return String.format("%d and %d is :: %d",num1,num2,(num1+num2));
//        return model.get("num1");

    }
}
