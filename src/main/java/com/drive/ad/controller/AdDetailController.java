package com.drive.ad.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drive.ad.entity.AdDetails;
import com.drive.ad.service.AdDetailService;

@RestController
public class AdDetailController {
	
	@Resource
	private AdDetailService adDetailService;

	@RequestMapping(
			value = "/adDetails", 
			method = RequestMethod.GET, 
			headers = "Accept=application/json")
	public List<AdDetails> getAdDetails() {
          return adDetailService.getAdList();
	}
	
	
}
