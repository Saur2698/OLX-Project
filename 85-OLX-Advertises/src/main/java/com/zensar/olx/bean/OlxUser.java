
package com.zensar.olx.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.lang.NonNull;

@Embeddable
public class OlxUser {
    
	@Column(name = "olx_user_id")
	private int olxuserId;
	
	@Transient
	private String userName;

    @Transient
	private String password;
    
    @Transient
	private String roles;
	
    @Transient
	private String firstName;
    
    @Transient
	private String lastName;
	
    @Transient
	private String emailId;
    
    @Transient
	private String phoneNumber;
	
    @Transient
    Active active;

	public OlxUser() {
		super();
	}

	public OlxUser(int olxuserId) {
		super();
		this.olxuserId = olxuserId;
	}

	public OlxUser(int olxuserId, String firstName, String lastName, String userName, Active active, String password,
			String emailId, String phoneNumber, String roles) {

		super();
		this.olxuserId = olxuserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.active = active;
		this.password = password;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.roles = roles;
	}

	public OlxUser(String firstName, String lastName, String userName, Active active, String password, String emailId,
			String phoneNumber, String roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.active = active;
		this.password = password;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.roles = roles;
	}

	public int getOlxuserId() {
		return olxuserId;
	}

	public void setOlxuserId(int olxuserId) {
		this.olxuserId = olxuserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "OlXUser [olxuserId=" + olxuserId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", active=" + active + ", password=" + password + ", emailId=" + emailId + ", phoneNumber="
				+ phoneNumber + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(olxuserId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OlxUser other = (OlxUser) obj;
		return olxuserId == other.olxuserId;
	}

}