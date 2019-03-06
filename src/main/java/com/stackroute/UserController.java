package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 *         Create annotation based Spring MVC application which has following feature:
 *
 *         A Login form having 2 text field - userName , userPassword
 *
 *         Once User clicks on the submit button data should be send to UserController ,
 *
 *         UserController will populate the data inside the User class .
 *
 *         UserController will pass user object to view (index.jsp).
 *
 *         View will display “Welcome <user> to stackroute”.
 */


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
