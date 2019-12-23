package com.mindtree.channelmanagement.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.channelmanagement.dto.ChannelDto;
import com.mindtree.channelmanagement.dto.ChannelGroupDto;
import com.mindtree.channelmanagement.dto.ShowDto;
import com.mindtree.channelmanagement.exception.ServiceException;
import com.mindtree.channelmanagement.service.ChannelGroupService;
import com.mindtree.channelmanagement.service.ChannelService;
import com.mindtree.channelmanagement.service.ShowService;

@Controller
public class ChannelController {
	
	@Autowired
	private ChannelService channelService;
	
	@Autowired
	private ChannelGroupService channelGroupService;
	
	@Autowired
	private ShowService showService;
	
	@RequestMapping("/addChannelGroup")
	public ResponseEntity<Map<String, Object>> addChannelGroup(@RequestBody ChannelGroupDto channelGroupDto) {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Header", "Details of ChannelGroup");
		response.put("Error", false);
		response.put("Body", channelGroupService.addChannelGroup(channelGroupDto));
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@RequestMapping("/addChannel")
	public ResponseEntity<Map<String, Object>> addChannel(@RequestBody ChannelDto channelDto) {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Header", "Details of Channel");
		response.put("Error", false);
		response.put("Body", channelGroupService.addChannel(channelDto));
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@RequestMapping("/addshows")
	public ResponseEntity<Map<String, Object>> addShows(@RequestBody ShowDto showDto) {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Header", "Details of show");
		response.put("Error", false);
		response.put("Body", channelGroupService.addShows(showDto));
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@RequestMapping("/addChannelToChannelGroup/{ChannelName}/{ChannelGroupName}")
	public ResponseEntity<Map<String, Object>> addChannelToChannelGroup(@PathVariable String ChannelName, @PathVariable String ChannelGroupName) throws ServiceException {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Header", "Details of show");
		response.put("Error", false);
		response.put("Body", channelGroupService.addChannelToChannelGroup(ChannelName,ChannelGroupName));
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@RequestMapping("/addShowToChannel/{showName}/{ChannelName}")
	public ResponseEntity<Map<String, Object>> addShowToChannel(@PathVariable String showName, @PathVariable String ChannelName) throws ServiceException {
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Header", "Details of show");
		response.put("Error", false);
		response.put("Body", channelGroupService.addShowToChannel(showName,ChannelName));
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@RequestMapping("/sort/{channelGroupId}")
	public ResponseEntity<Map<String, Object>> sorting(@PathVariable int channelGroupId){
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("Header", "Details of show");
		response.put("Error", false);
		response.put("Body", channelGroupService.sorting(channelGroupId));
		response.put("HttpStatus", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
}
