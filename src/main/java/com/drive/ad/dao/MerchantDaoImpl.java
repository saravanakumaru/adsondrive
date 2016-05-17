package com.drive.ad.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.drive.ad.entity.Merchant;
import com.google.common.collect.Lists;

@Component
public class MerchantDaoImpl{

	
	public List<Merchant> getMerchants() {
		Merchant merchant1 = new Merchant();
		merchant1.setMerchantId(1l);
		Merchant merchant2 = new Merchant();
		merchant2.setMerchantId(2l);
		return Lists.newArrayList(merchant1,merchant2);
	}

}
