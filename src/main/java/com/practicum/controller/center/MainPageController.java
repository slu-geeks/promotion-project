package com.practicum.controller.center;

import com.practicum.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MainPageController {

    private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(MainPageController.class.getName());
    private static final String FORWARD_URL = "backend/main/appearance";


    @RequestMapping(value = {"home", "", "main"}, method = RequestMethod.GET)
    public String mainPageRender(Model model) {
        model.addAttribute("name", "Mark");

        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(@ModelAttribute("user") @Valid User user){
        System.out.println();
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginProcess(@ModelAttribute("user") @Valid User user, BindingResult result){

        return "";
    }
}
