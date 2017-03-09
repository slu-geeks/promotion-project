package com.practicum.controller.center;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainPageController {

    private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(MainPageController.class.getName());
    private static final String FORWARD_URL = "backend/main/appearance";


    @RequestMapping(value = {"home", "", "main"}, method = RequestMethod.GET)
    public String mainPageRender() {
        return "index";
    }
}
