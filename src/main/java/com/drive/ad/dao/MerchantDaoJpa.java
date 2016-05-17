package com.drive.ad.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drive.ad.entity.Merchant;

@SuppressWarnings("unchecked")
public interface MerchantDaoJpa extends BaseRepository<Merchant,Long> {
	
	
	void delete(Merchant merchantToBeDeleted);
	 
    List<Merchant> findAll();
 
    Merchant findOne(Long id);
  
	Merchant save(Merchant persisted);

}
