package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class LicenseRequest {
	private Integer lId;
	private String result,action;
	private RegistrationDetails registration; 
	
	public LicenseRequest() {
		// TODO Auto-generated constructor stub
	}

	

	public LicenseRequest(Integer lId, String result, String action) {
		super();
		this.lId = lId;
		this.result = result;
		this.action = action;
	}


	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getlId() {
		return lId;
	}



	public void setlId(Integer lId) {
		this.lId = lId;
	}



	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}


    @OneToOne
    @JoinColumn(name = "reg_id")
	public RegistrationDetails getRegistration() {
		return registration;
	}



	public void setRegistration(RegistrationDetails registration) {
		this.registration = registration;
	}
	
	

}
