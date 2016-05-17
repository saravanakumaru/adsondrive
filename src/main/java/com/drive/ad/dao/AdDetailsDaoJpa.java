package com.drive.ad.dao;

import java.util.List;

import com.drive.ad.entity.AdDetails;

public interface AdDetailsDaoJpa extends BaseRepository<AdDetails,Long> {
	
	void delete(AdDetails adDetailToBeDeleted);
	 
    List<AdDetails> findAll();
 
    AdDetails findOne(Long id);
  
    AdDetails save(AdDetails persisted);


}
