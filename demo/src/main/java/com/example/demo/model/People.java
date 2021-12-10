package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Entity
@Table(name="user")
@Component
public class People {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userName;
	private String userPassword;
	private Integer userAge;
	private String gender;
	private String userCity;
	
	/*public People(Integer id, String userName, String userPassword, Integer userAge, String userCity) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAge = userAge;
		this.userCity = userCity;
	}*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", userAge=" + userAge
				+ ", Gender=" + gender + ", userCity=" + userCity + "]";
	}
	
	
	
}

