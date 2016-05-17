package com.drive.ad.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_auto")
public class Auto {
	
	@Id
	@GeneratedValue
	@Column(name = "idm_auto")
	private Long autoId;
	@Column(name = "owner_name")
	private String ownerName;
	@Column(name = "registration_no")
	private String registrationNumber;
	@Column(name = "driver_name")
	private String driverName;
	@Column(name = "owner_is_driver")
	private String isDriverOwner;
	@Column(name = "driver_contact_no")
	private String driverContactNumber;
	@Column(name = "owner_address")
	private String ownerAddress;
	@Column(name = "owner_contact_no")
	private String ownerContactNo;
	@Column(name = "owner_mobile_no")
	private String ownerMobileNo;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "permit_validity_end")
	private Date permitValidityEndDate;
	
	@OneToMany(mappedBy="auto",targetEntity=AdDetails.class,
		       fetch=FetchType.EAGER)
	private List<AdDetails> adsForAuto;
	
	public Long getAutoId() {
		return autoId;
	}
	public void setAutoId(Long autoId) {
		this.autoId = autoId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getIsDriverOwner() {
		return isDriverOwner;
	}
	public void setIsDriverOwner(String isDriverOwner) {
		this.isDriverOwner = isDriverOwner;
	}
	public String getDriverContactNumber() {
		return driverContactNumber;
	}
	public void setDriverContactNumber(String driverContactNumber) {
		this.driverContactNumber = driverContactNumber;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerContactNo() {
		return ownerContactNo;
	}
	public void setOwnerContactNo(String ownerContactNo) {
		this.ownerContactNo = ownerContactNo;
	}
	public String getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(String ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	public Date getPermitValidityEndDate() {
		return permitValidityEndDate;
	}
	public void setPermitValidityEndDate(Date permitValidityEndDate) {
		this.permitValidityEndDate = permitValidityEndDate;
	}
	public List<AdDetails> getAdsForAuto() {
		return adsForAuto;
	}
	public void setAdsForAuto(List<AdDetails> adsForAuto) {
		this.adsForAuto = adsForAuto;
	}
	
	
	

}
