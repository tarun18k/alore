package com.AlorePTE.HotelManagement.Entity;

import java.time.LocalTime;
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
@Table(name ="hotel")
public class Hotel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@NotNull(message = "required")
@Column(nullable = false)
private String name;
private int rating;
@NotNull(message = "required")
@Column(nullable = false)
private String city;
@NotNull(message = "required")
@Column(nullable = false)
private int numberOfRoomsAvailable;
private int roomCapacity;
private boolean wifiFacility;
private boolean restaraunt;
private int roomCost;
private boolean airConditioning;
@OneToMany
private List<Comments> userComments;
private String mealIncluded;
@NotNull(message = "required")
@Column(nullable = false)
private String address;
private LocalTime checkInTime;
private LocalTime checkOutTime;
@NotNull(message = "required")
@Column(nullable = false)
private long contactNumber;
private String email;
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
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getNumberOfRoomsAvailable() {
	return numberOfRoomsAvailable;
}
public void setNumberOfRoomsAvailable(int numberOfRoomsAvailable) {
	this.numberOfRoomsAvailable = numberOfRoomsAvailable;
}
public int getRoomCapacity() {
	return roomCapacity;
}
public void setRoomCapacity(int roomCapacity) {
	this.roomCapacity = roomCapacity;
}
public boolean isWifiFacility() {
	return wifiFacility;
}
public void setWifiFacility(boolean wifiFacility) {
	this.wifiFacility = wifiFacility;
}
public boolean isRestaraunt() {
	return restaraunt;
}
public void setRestaraunt(boolean restaraunt) {
	this.restaraunt = restaraunt;
}
public int getRoomCost() {
	return roomCost;
}
public void setRoomCost(int roomCost) {
	this.roomCost = roomCost;
}
public boolean isAirConditioning() {
	return airConditioning;
}
public void setAirConditioning(boolean airConditioning) {
	this.airConditioning = airConditioning;
}
public List<Comments> getUserComments() {
	return userComments;
}
public void setUserComments(List<Comments> userComments) {
	this.userComments = userComments;
}
public String getMealIncluded() {
	return mealIncluded;
}
public void setMealIncluded(String mealIncluded) {
	this.mealIncluded = mealIncluded;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public LocalTime getCheckInTime() {
	return checkInTime;
}
public void setCheckInTime(LocalTime checkInTime) {
	this.checkInTime = checkInTime;
}
public LocalTime getCheckOutTime() {
	return checkOutTime;
}
public void setCheckOutTime(LocalTime checkOutTime) {
	this.checkOutTime = checkOutTime;
}
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Hotel [name=" + name + ", rating=" + rating + ", city=" + city + ", numberOfRoomsAvailable="
			+ numberOfRoomsAvailable + ", mealIncluded=" + mealIncluded + ", address=" + address + ", contactNumber="
			+ contactNumber + "]";
}

}
