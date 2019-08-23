package com.dataAnalytics.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dataAnalytics.beans.GenericRequest;
import com.dataAnalytics.beans.GenericResponse;

public class PreLoginController {

	 static final Logger logger = LoggerFactory.getLogger(PreLoginController.class);
	
	
	  @RequestMapping(value = "/clientActivityApproval/", method = RequestMethod.POST)
	    public ResponseEntity<GenericResponse> clientActivityApproval(@RequestBody GenericRequest<ResponseBody> master, HttpServletRequest request) throws ParseException {
		  logger.info("-------clientActivityMasterSubmit :");
	        SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy");
	        GenericResponse<Object> response = new GenericResponse<Object>();
	        HttpSession httpSession = request.getSession(false);
	        
	        return new ResponseEntity<GenericResponse>(response, HttpStatus.OK);     
	  }
}
