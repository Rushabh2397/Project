package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class ConfirmedLicensces {
	private Integer cId;
	private String licensceNo;
	private RegistrationDetails registration;
	public ConfirmedLicensces() {
		// TODO Auto-generated constructor stub
	}

	public ConfirmedLicensces(Integer cId, String licensceNo) {
		super();
		this.cId = cId;
		this.licensceNo = licensceNo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}
    @Column(length = 13 )
	public String getLicensceNo() {
		return licensceNo;
	}

	public void setLicensceNo(String licensceNo) {
		this.licensceNo = licensceNo;
	}
	
	
    @OneToOne
    @JoinColumn(name = "r_id")
	public RegistrationDetails getRegistration() {
		return registration;
	}

	public void setRegistration(RegistrationDetails registration) {
		this.registration = registration;
	}
	

	
}
