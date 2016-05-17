package com.drive.ad.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.drive.ad.dao.MerchantDaoJpa;
import com.drive.ad.entity.Merchant;

@Service
public class MerchantServiceImpl implements MerchantService {
	
	@Resource
	private MerchantDaoJpa merchantDao;

	@Override
	public List<Merchant> getListOfMerchants() {
		// TODO Auto-generated method stub
		return merchantDao.findAll();
	}

}
