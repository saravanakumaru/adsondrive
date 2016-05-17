package com.drive.ad.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drive.ad.entity.Auto;
import com.drive.ad.service.AutoService;

@RestController
public class AutoController {
	
	@Resource
	private AutoService autoService;

	@RequestMapping(
			value = "/autos", 
			method = RequestMethod.GET, 
			headers = "Accept=application/json")
	public List<Auto> getMerchants() {
          return autoService.getAutoList();
	}
}
