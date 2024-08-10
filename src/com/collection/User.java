package com.collection;

import java.time.LocalDate;

public class User {

	private Integer id;
	private String name;
	private LocalDate localDate;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, LocalDate localDate) {
		super();
		this.id = id;
		this.name = name;
		this.localDate = localDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDateTime(LocalDate localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", localDate=" + localDate + "]";
	}
	
	

}
