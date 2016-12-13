package com.webskeleton.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by taqmuq on 12/12/16.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
