package com.example.activeMqConsumer.controller;



public class Cd {
	
	private String title;
	private String artist;
	private String country;
	private String company;
	private Double price;
	private Integer year;
	
	
	public Cd() {
		
	}
		
	public Cd(String title, String artist, String country, String company, Double price, Integer year) {
		super();
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.company = company;
		this.price = price;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double long1) {
		this.price = long1;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	
	

}
