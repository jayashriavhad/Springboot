package com.sorting.example.entities;

import org.springframework.data.domain.Sort;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User 
{
	@Id
	private int id;
	private String name;
	private String add;
	
	
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	public static Sort by(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
