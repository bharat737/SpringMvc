package com.dataAnalytics.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("")
public class MainTemplateController {
//	private static final Logger logger = Logger.getLogger(MainTemplateController.class);
    @RequestMapping(value="/computers")
    public String getComputersTemplate() {
    	return "template/item_computers";	
    }
    
    @RequestMapping(value="/dashboard")
    public String getDashboardTemplate() {
    	
//    	logger.info("Call dashboard template");
    	return "template/dashboard";	
    }
    
    @RequestMapping(value="/login")
    public String getLoginTemplate() {
    	
//    	logger.info("Call Login template");
    	return "template/login";	
    }

}

