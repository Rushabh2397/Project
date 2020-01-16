package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address extends AbstractEntity
{
private String cState,cDistrict,cCity,cAddress,cPincode;
private String pState,pDistrict,pCity,pAddress,pPincode;
private RegistrationDetails registration;



public Address() {
	// TODO Auto-generated constructor stub
}


public Address(String cState, String cDistrict, String cCity, String cAddress, String pState, String pDistrict,
		String pCity, String pAddress) {
	super();
	this.cState = cState;
	this.cDistrict = cDistrict;
	this.cCity = cCity;
	this.cAddress = cAddress;
	this.pState = pState;
	this.pDistrict = pDistrict;
	this.pCity = pCity;
	this.pAddress = pAddress;
}

@Column(length = 20 ) 
public String getcState() {
	return cState;
}


public void setcState(String cState) {
	this.cState = cState;
}

@Column(length = 20 )
public String getcDistrict() {
	return cDistrict;
}


public void setcDistrict(String cDistrict) {
	this.cDistrict = cDistrict;
}

@Column(length = 20 )
public String getcCity() {
	return cCity;
}


public void setcCity(String cCity) {
	this.cCity = cCity;
}

@Column(length = 50 )
public String getcAddress() {
	return cAddress;
}


public void setcAddress(String cAddress) {
	this.cAddress = cAddress;
}

@Column(length = 20 )
public String getpState() {
	return pState;
}


public void setpState(String pState) {
	this.pState = pState;
}

@Column(length = 20 )
public String getpDistrict() {
	return pDistrict;
}


public void setpDistrict(String pDistrict) {
	this.pDistrict = pDistrict;
}

@Column(length = 20 )
public String getpCity() {
	return pCity;
}


public void setpCity(String pCity) {
	this.pCity = pCity;
}

@Column(length = 50 )
public String getpAddress() {
	return pAddress;
}


public void setpAddress(String pAddress) {
	this.pAddress = pAddress;
}

@Column(length = 6 )
public String getcPincode() {
	return cPincode;
}


public void setcPincode(String cPincode) {
	this.cPincode = cPincode;
}

@Column(length = 6 )
public String getpPincode() {
	return pPincode;
}


public void setpPincode(String pPincode) {
	this.pPincode = pPincode;
}


@OneToOne
@JoinColumn(name ="regId" )
public RegistrationDetails getRegistration() {
	return registration;
}


public void setRegistration(RegistrationDetails registration) {
	this.registration = registration;
}







}
