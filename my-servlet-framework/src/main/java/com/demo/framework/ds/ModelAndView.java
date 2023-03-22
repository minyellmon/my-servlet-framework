package com.demo.framework.ds;

import com.demo.framework.model.Model;
import com.demo.framework.view.View;

public class ModelAndView {
    private final Model model;
    private final View view;

    public ModelAndView(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }
}
