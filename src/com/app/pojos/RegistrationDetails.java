package com.app.pojos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class RegistrationDetails {

	private Integer rId;
	private String firstName,middleName,lastName,bloodGroup,gender;
	private int mobileNo,addharCard;
	private Date dob;
	private String guardianName,guardianNo,realtion;
	private String email,password;
	private Address adr;
	private Role role;
	private LicenseRequest req;
	private ApplicationTable app;
	private LicenseType licenseType;
	private ConfirmedLicensces confirm;
	
	
	public RegistrationDetails() {
		// TODO Auto-generated constructor stub
	}


	public RegistrationDetails(String firstName, String middleName, String lastName, String bloodGroup, String gender,
			int mobileNo, int addharCard, Date dob, String guardianName, String guardianNo, String realtion,
			String email, String password,Role role) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.addharCard = addharCard;
		this.dob = dob;
		this.guardianName = guardianName;
		this.guardianNo = guardianNo;
		this.realtion = realtion;
		this.email = email;
		this.password = password;
		this.role=role;
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getrId() {
		return rId;
	}


	public void setrId(Integer rId) {
		this.rId = rId;
	}

	@Column(length = 12,nullable = false,unique = true)
	public int getAddharCard() {
		return addharCard;
	}
	public void setAddharCard(int addharCard) {
		this.addharCard = addharCard;
	}

    @Column(length = 20,nullable = false)
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

    @Column(length = 20,nullable = false) 
	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

    @Column(length = 20,nullable = false)
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    @Column(length =5 )
	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

    @Column(length=6,nullable = false)
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

    @Column(length = 10)
	public int getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(length = 20)
	public String getGuardianName() {
		return guardianName;
	}


	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

    @Column(length = 10) 
	public String getGuardianNo() {
		return guardianNo;
	}


	public void setGuardianNo(String guardianNo) {
		this.guardianNo = guardianNo;
	}

	@Column(length = 20)
	public String getRealtion() {
		return realtion;
	}


	public void setRealtion(String realtion) {
		this.realtion = realtion;
	}

	  @Column(unique = true, length = 25,nullable = false ) 
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

    @Column(length = 15,nullable = false )
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@OneToOne(mappedBy = "registration",cascade = CascadeType.ALL,orphanRemoval = true)
   
	public Address getAdr() {
		return adr;
	}


	public void setAdr(Address adr) {
		this.adr = adr;
	}
	// convenience methods
	
	public void addAddress(Address a)
	{
		// registrationdetails ---> address
		this.adr=a;
		a.setRegistration(this);// address ---> registration details
	}
	public void removeAddress(Address a)
	{
		adr=null;
		a.setRegistration(null);
	}

    @Enumerated(EnumType.STRING)
	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}

   @OneToOne(mappedBy = "registration",cascade = CascadeType.ALL,orphanRemoval = true)
	public LicenseRequest getReq() {
		return req;
	}


	public void setReq(LicenseRequest req) {
		this.req = req;
	}

	 @OneToOne(mappedBy = "registration",cascade = CascadeType.ALL,orphanRemoval = true)
	public ApplicationTable getApp() {
		return app;
	}


	public void setApp(ApplicationTable app) {
		this.app = app;
	}

  

    @Enumerated(EnumType.STRING)
	public LicenseType getLicenseType() {
		return licenseType;
	}


	public void setLicenseType(LicenseType licenseType) {
		this.licenseType = licenseType;
	}


	@OneToOne(mappedBy = "registration",cascade = CascadeType.ALL,orphanRemoval = true)
	public ConfirmedLicensces getConfirm() {
		return confirm;
	}


	public void setConfirm(ConfirmedLicensces confirm) {
		this.confirm = confirm;
	}


	
	
	
	
	
	
	

}
