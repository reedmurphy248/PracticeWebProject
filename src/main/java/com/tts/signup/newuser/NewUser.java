package com.tts.signup.newuser;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class NewUser {
	
	//field variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String userName;
	private String emailAddress;
	private String password;
	
	@Column
	@CreationTimestamp
	private Date signedUp;
	
	//constructor
	public NewUser() {
		
	}

	public NewUser(String userName, String emailAddress, String password, Date signedUp) {
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.password = password;
		this.signedUp = signedUp;
	}

	//getters and setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	public Long getId() {
		return id;
	}

	//methods
	@Override
	public String toString() {
		return "NewUser [id=" + id + ", userName=" + userName + ", emailAddress=" + emailAddress + ", password="
				+ password + ", signedUp=" + signedUp + "]";
	}
	
	


}
