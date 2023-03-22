package com.demo.application.controller;

import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.SimpleModel;
import com.demo.application.view.IndexView;
import jakarta.servlet.http.HttpServletRequest;

@ControllerMapping(value = "/")
public class IndexController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest req) {
        return new ModelAndView(
                new SimpleModel(),
                new IndexView()
        );
    }
}
