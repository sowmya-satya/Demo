package com.mindtree.channelmanagement.controller.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.channelmanagement.controller.ChannelController;
import com.mindtree.channelmanagement.exception.ServiceException;


@RestControllerAdvice(assignableTypes = ChannelController.class)
public class ControlHandler {
@ExceptionHandler(ServiceException.class)

public ResponseEntity<Map<String, Object>> ServiceExceptionHandler(Exception e,Throwable cause){
	Map<String, Object> response = new HashMap<String, Object>();
	response.put("Header", "Exception");
	response.put("Error", true);
	response.put("Body",e.getMessage());
	response.put("HttpStatus",HttpStatus.BAD_REQUEST);
	return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
}

}
