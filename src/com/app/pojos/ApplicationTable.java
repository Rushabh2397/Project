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
public class ApplicationTable {
	private Integer appId;
	private String action;
	private RegistrationDetails registration;
	
	public ApplicationTable() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationTable(Integer appId, String action) {
		super();
		this.appId = appId;
		this.action = action;
	}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}
    @Column(length = 7)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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
