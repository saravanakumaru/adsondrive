package com.drive.ad.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "m_merchant")
public class Merchant {

	@Id
	@GeneratedValue
	@Column(name = "id_merchant")
	private Long merchantId;
	
	@Column(name = "merchant_name")
    private String merchantName;
	
	@Column(name = "merchant_shop_id")
    private String merchantShopId;
	
	@Column(name = "shop_address")
    private String merchantShopAddress;
	
	@Column(name = "tele_no")
    private String merchantShopPhone;
	
	@Column(name = "mobile_no")
    private String merchantHandPhone;
	
	@Column(name = "merchant_contact_employee")
    private String merchantContactEmployee;
	
	@Column(name = "city")
    private String city;
	
	@Column(name = "state")
    private String state;
	
	@Column(name = "pincode")
    private String pincode;
	
	@OneToMany(mappedBy="merchant",targetEntity=AdDetails.class,
		       fetch=FetchType.EAGER)
	private List<AdDetails> adsForMerchant;

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantShopId() {
		return merchantShopId;
	}

	public void setMerchantShopId(String merchantShopId) {
		this.merchantShopId = merchantShopId;
	}

	public String getMerchantShopAddress() {
		return merchantShopAddress;
	}

	public void setMerchantShopAddress(String merchantShopAddress) {
		this.merchantShopAddress = merchantShopAddress;
	}

	public String getMerchantShopPhone() {
		return merchantShopPhone;
	}

	public void setMerchantShopPhone(String merchantShopPhone) {
		this.merchantShopPhone = merchantShopPhone;
	}

	public String getMerchantHandPhone() {
		return merchantHandPhone;
	}

	public void setMerchantHandPhone(String merchantHandPhone) {
		this.merchantHandPhone = merchantHandPhone;
	}

	public String getMerchantContactEmployee() {
		return merchantContactEmployee;
	}

	public void setMerchantContactEmployee(String merchantContactEmployee) {
		this.merchantContactEmployee = merchantContactEmployee;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<AdDetails> getAdsForMerchant() {
		return adsForMerchant;
	}

	public void setAdsForMerchant(List<AdDetails> adsForMerchant) {
		this.adsForMerchant = adsForMerchant;
	}
}
