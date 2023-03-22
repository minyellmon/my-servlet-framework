package com.demo.framework.servlet;

import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.Model;
import com.demo.framework.util.ApplicationControllerFinders;
import com.demo.framework.view.View;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(name = "frameworkServlet",urlPatterns = "/*")
public class FrameWorkServlet extends HttpServlet {

    private Map<String, IController> controllerMap;
    @Override
    public void init() throws ServletException {
        controllerMap=new ApplicationControllerFinders().findControllers();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uriString = req.getRequestURI();
        IController controller= controllerMap.get(uriString);

        if(controller!=null){
            ModelAndView modelAndView=controller.handleRequest(req);
            Model model=modelAndView.getModel();
            View view=modelAndView.getView();
            String renderString=view.render(model);
            resp.setContentType("text/html");
            resp.getWriter().print(renderString);
        }else {
            throw new ServletException(String.format("%s don't match any controller.",uriString));
        }
    }
}
