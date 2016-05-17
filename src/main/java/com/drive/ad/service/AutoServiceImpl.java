package com.drive.ad.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.drive.ad.dao.AutoDaoJpa;
import com.drive.ad.entity.Auto;

@Service
public class AutoServiceImpl implements AutoService {
	
	@Resource
	private AutoDaoJpa autoDaoJpa;

	@Override
	public List<Auto> getAutoList() {
		return autoDaoJpa.findAll();
	}

}
