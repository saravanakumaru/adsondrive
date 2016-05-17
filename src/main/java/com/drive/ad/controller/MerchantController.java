package com.drive.ad.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drive.ad.entity.Merchant;
import com.drive.ad.service.MerchantService;
import com.drive.ad.vo.MerchantRequestVO;

@RestController
public class MerchantController {
	
	@Resource
	private MerchantService merchantService;

	@RequestMapping(
			value = "/merchants", 
			method = RequestMethod.GET, 
			headers = "Accept=application/json")
	public List<Merchant> getMerchants() {
          return merchantService.getListOfMerchants();
	}
	
	@RequestMapping(
			value = "/merchant/add", 
			method = RequestMethod.POST, 
			headers = "Accept=application/json")
	public ResponseEntity<Void>  addMerchant(@RequestBody MerchantRequestVO merchantRequest) {
          System.out.println(merchantRequest);
          return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
