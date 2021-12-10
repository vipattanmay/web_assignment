package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.People;
import com.example.demo.repository.PeopleRepository;

@Service
public class PeopledaoImpl implements Peopledao{
	
	@Autowired
	PeopleRepository PeopleRepository;
	
	@Override
	public void addPeople(People people) {
		// TODO Auto-generated method stub
		PeopleRepository.save(people);
	}
	@Override
	public List<People> getAllPeople(){
		List<People> peopleList =  PeopleRepository.findAll();
		return peopleList;
	}
	@Override
	public People getPeopleById(int id) {
		// TODO Auto-generated method stub
		People people=PeopleRepository.getById(id);
		return people;
	}
	@Override
	public void updatePeople(People people) {
		// TODO Auto-generated method stub
		PeopleRepository.save(people);
		
	}
	@Override
	public void deletePeople(int id) {
		// TODO Auto-generated method stub
		PeopleRepository.deleteById(id);
	}
	@Override
	public People validatePeople(People people) {
		// TODO Auto-generated method stub
		People p=PeopleRepository.findByLoginData(people.getUserName(), people.getUserPassword());
		return p;
	}
	
}
