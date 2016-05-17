package com.drive.ad.dao;

import java.util.List;

import com.drive.ad.entity.Auto;

public interface AutoDaoJpa extends BaseRepository<Auto,Long> {
	
	void delete(Auto autoToBeDeleted);
	 
    List<Auto> findAll();
 
    Auto findOne(Long id);
  
    Auto save(Auto persisted);

}
