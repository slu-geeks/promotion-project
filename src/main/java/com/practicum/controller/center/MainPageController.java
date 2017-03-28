package com.practicum.controller.center;

import com.practicum.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/")
public class MainPageController {

    private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(MainPageController.class.getName());
    private static final String FORWARD_URL = "backend/main/appearance";


    @RequestMapping(value = {"home", "", "main"}, method = RequestMethod.GET)
    public String mainPageRender(Model model) {

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(UUID.randomUUID().toString().substring(0,8));
        }

        model.addAttribute("name", "Mark");
        model.addAttribute("listName", list);

        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage(@ModelAttribute("user") @Valid User user){
        System.out.println();
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginProcess(@ModelAttribute("user") @Valid User user, BindingResult result){

        String username = user.getUsername();
        String password = user.getPassword();


        return "";
    }
}
