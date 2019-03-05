package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController{

    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest request){
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = new User(name,password);

        ModelAndView mv = new ModelAndView();

        mv.setViewName("login");
        mv.addObject("name",name);
        mv.addObject("password",password);

        return mv;

    }

}
