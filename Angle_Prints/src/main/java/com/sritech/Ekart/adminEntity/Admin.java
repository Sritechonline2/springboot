package com.sritech.Ekart.adminEntity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "root_admin_user")

public class Admin {
	@Id
	@Column(name = "Admin_LOGIN_ID")
	private String userLoginId;

	@Column(name = "Admin_PASSWORD")
	private String userPassword;

	@Column(name = "Admin_NAME")
	private String userName;
	
	@Column(name = "Admin_MOBILE_NUM1")
	private Long userMobileNumber1;

	@Column(name = "Admin_MOBILE_NUM2")
	private Long userMobileNumber2;

	@Column(name = "DATE_CREATED")
	private Date dateCareted;
	
	@Column(name = "DATE_UPDATED")
	private Date DateUpdated;

	
	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserMobileNumber1() {
		return userMobileNumber1;
	}

	public void setUserMobileNumber1(Long userMobileNumber1) {
		this.userMobileNumber1 = userMobileNumber1;
	}

	public Long getUserMobileNumber2() {
		return userMobileNumber2;
	}

	public void setUserMobileNumber2(Long userMobileNumber2) {
		this.userMobileNumber2 = userMobileNumber2;
	}

	public Date getDateCareted() {
		return dateCareted;
	}

	public void setDateCareted(Date dateCareted) {
		this.dateCareted = dateCareted;
	}

	public Date getDateUpdated() {
		return DateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		DateUpdated = dateUpdated;
	}

	@Override
	public String toString() {
		return "Admin [userLoginId=" + userLoginId + ", userPassword=" + userPassword + ", userName=" + userName
				+ ", userMobileNumber1=" + userMobileNumber1 + ", userMobileNumber2=" + userMobileNumber2
				+ ", dateCareted=" + dateCareted + ", DateUpdated=" + DateUpdated + "]";
	}
	
	

}
