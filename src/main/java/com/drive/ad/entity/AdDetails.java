package com.drive.ad.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_ad_details")
public class AdDetails {

	@Id
	@GeneratedValue
	@Column(name = "idt_ad_details")
	private Long adDetailsId;

	@ManyToOne(optional = false)
	@JoinColumn(name = "merchant_id", referencedColumnName = "id_merchant")
	private Merchant merchant;

	@ManyToOne(optional = false)
	@JoinColumn(name = "auto_id", referencedColumnName = "idm_auto")
	private Auto auto;

	@Column(name = "ad_creative_html")
	private String adCreativeData;
	@Column(name = "ad_start_date")
	private Date adStartDate;
	@Column(name = "ad_end_date")
	private Date adEndDate;
	@Column(name = "isCancelled")
	private String adCancelled;
	@Column(name = "cancel_start_date")
	private Date cancelDate;
	@Column(name = "cancel_initiated_by")
	private String cancelInitiatedBy;
	@Column(name = "is_cashback_enabled")
	private String cashBackEnabled;
	@Column(name = "is_active")
	private String isAdActive;

	public Long getAdDetailsId() {
		return adDetailsId;
	}

	public void setAdDetailsId(Long adDetailsId) {
		this.adDetailsId = adDetailsId;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public String getAdCreativeData() {
		return adCreativeData;
	}

	public void setAdCreativeData(String adCreativeData) {
		this.adCreativeData = adCreativeData;
	}

	public Date getAdStartDate() {
		return adStartDate;
	}

	public void setAdStartDate(Date adStartDate) {
		this.adStartDate = adStartDate;
	}

	public Date getAdEndDate() {
		return adEndDate;
	}

	public void setAdEndDate(Date adEndDate) {
		this.adEndDate = adEndDate;
	}

	public String getAdCancelled() {
		return adCancelled;
	}

	public void setAdCancelled(String adCancelled) {
		this.adCancelled = adCancelled;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCancelInitiatedBy() {
		return cancelInitiatedBy;
	}

	public void setCancelInitiatedBy(String cancelInitiatedBy) {
		this.cancelInitiatedBy = cancelInitiatedBy;
	}

	public String getCashBackEnabled() {
		return cashBackEnabled;
	}

	public void setCashBackEnabled(String cashBackEnabled) {
		this.cashBackEnabled = cashBackEnabled;
	}

	public String getIsAdActive() {
		return isAdActive;
	}

	public void setIsAdActive(String isAdActive) {
		this.isAdActive = isAdActive;
	}
}
