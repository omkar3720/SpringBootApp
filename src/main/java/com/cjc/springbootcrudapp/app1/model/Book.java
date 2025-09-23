package com.cjc.springbootcrudapp.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bid;
private String bookname;
private int bookprice;

public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public int getBookprice() {
	return bookprice;
}
public void setBookprice(int bookprice) {
	this.bookprice = bookprice;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
}

}
