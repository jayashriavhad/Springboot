package com.sorting.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sorting.example.entities.User;
import com.sorting.example.service.Sortservice;



@RestController
public class Sortcontroller {
	@Autowired
	private Sortservice service;
	
	@GetMapping("/{field}")
	public List<User> getUserWithSort(@PathVariable  String field)
	{
		List<User> allUsers=service.findUserWithSorting(field);
		return allUsers;
	}
}
