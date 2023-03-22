package com.demo.application.controller;

import com.demo.application.view.SquareNumberView;
import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.SimpleModel;
import jakarta.servlet.http.HttpServletRequest;
@ControllerMapping(value = "/square-number")
public class SquareNumberController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest req) {
        SimpleModel model=new SimpleModel();
        model.set("num1",req.getParameter("num1"));
        return new ModelAndView(
                model,new SquareNumberView()
        );
    }
}
