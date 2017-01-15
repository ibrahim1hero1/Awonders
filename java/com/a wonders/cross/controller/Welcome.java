
package com.awonders.cross.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    @author Ibrahim Abdsaid Hanna @2017
            ibrahim.seniore@gmail.com
 */
@Controller
public class Welcome {
    
    @RequestMapping(value = "/welcome")
    public String welcomePage(Model model){
        
        return "welcome";
    }
    
    
    
}
