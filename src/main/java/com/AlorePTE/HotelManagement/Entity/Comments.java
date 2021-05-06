package com.AlorePTE.HotelManagement.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="comments")
public class Comments {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private int rating;
private String comment;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "Hotel_id", referencedColumnName = "id")
private Hotel hotel;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "User_id", referencedColumnName = "id")
private User user;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public Hotel getHotel() {
	return hotel;
}
public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
@Override
public String toString() {
	return "Comments [id=" + id + ", rating=" + rating + ", comment=" + comment + "]";
}

}
