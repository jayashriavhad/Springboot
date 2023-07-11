package com.sorting.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sorting.example.entities.User;
import com.sorting.example.repository.UserRepository;

@Service
public class Sortservice {
	@Autowired
	private UserRepository userrepo;
	
	public List<User>findUserWithSorting(String field)
	{
		return userrepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
}
