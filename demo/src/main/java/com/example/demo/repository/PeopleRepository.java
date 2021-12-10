package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.People;

public interface PeopleRepository extends JpaRepository<People, Integer> {
	@Query("select p from People p where p.userName=(:userName) and p.userPassword=(:userPassword)")
	People findByLoginData(String userName, String userPassword);
}
