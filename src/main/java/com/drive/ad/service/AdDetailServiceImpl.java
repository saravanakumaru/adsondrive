package com.drive.ad.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.drive.ad.dao.AdDetailsDaoJpa;
import com.drive.ad.entity.AdDetails;

@Service
public class AdDetailServiceImpl implements AdDetailService {
	
	@Resource
	private AdDetailsDaoJpa adDetailDaoJpa;

	@Override
	public List<AdDetails> getAdList() {
		return adDetailDaoJpa.findAll();
	}

}
