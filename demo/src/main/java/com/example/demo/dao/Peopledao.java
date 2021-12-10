package com.example.demo.dao;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.People;

public interface Peopledao {

	public void addPeople(People people);
	public List<People> getAllPeople();
	public People getPeopleById(int id);
	public void updatePeople(People people);
	public void deletePeople(int id);
	public People validatePeople(People people);
}
