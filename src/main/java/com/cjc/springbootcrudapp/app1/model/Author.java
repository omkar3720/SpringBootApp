package com.cjc.springbootcrudapp.app1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author 
{
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private long mobileno;
@Column(unique = true)
private String username;
private String password;
@OneToOne(cascade = CascadeType.ALL)
private Book b;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Book getB() {
	return b;
}
public void setB(Book b) {
	this.b = b;
}
@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + ", address=" + address + ", mobileno=" + mobileno + ", username="
			+ username + ", password=" + password + ", b=" + b + "]";
}

}
