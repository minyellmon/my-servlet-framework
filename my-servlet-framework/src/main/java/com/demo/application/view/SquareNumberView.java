package com.demo.application.view;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class SquareNumberView implements View {
    @Override
    public String render(Model model) {
        int num1=Integer.parseInt(model.get("num1"));
        return String.format("%s of square is:: %s",num1, (num1*num1));
    }
}
