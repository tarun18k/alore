package com.AlorePTE.HotelManagement.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@NotNull(message = "required")
@Column(nullable = false)
private String name;
@NotNull(message = "required")
@Column(nullable = false)
private long mobileNumber;
@OneToMany
private List<Comments> comment;
@OneToMany
private List<Hotel> hotelsStayed;
private String gender;
private String residentialCity;
@NotNull(message = "required")
@Column(nullable = false)
private String aadharId;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public List<Comments> getComment() {
	return comment;
}
public void setComment(List<Comments> comment) {
	this.comment = comment;
}
public List<Hotel> getHotelsStayed() {
	return hotelsStayed;
}
public void setHotelsStayed(List<Hotel> hotelsStayed) {
	this.hotelsStayed = hotelsStayed;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getResidentialCity() {
	return residentialCity;
}
public void setResidentialCity(String residentialCity) {
	this.residentialCity = residentialCity;
}
public String getAadharId() {
	return aadharId;
}
public void setAadharId(String aadharId) {
	this.aadharId = aadharId;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", hotelsStayed=" + hotelsStayed
			+ ", aadharId=" + aadharId + "]";
}

}
