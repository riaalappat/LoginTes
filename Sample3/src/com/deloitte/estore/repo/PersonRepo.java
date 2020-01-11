package com.deloitte.estore.repo;

import com.deloitte.estore.model.Person;



import java.sql.Connection;

import java.util.*;



public interface PersonRepo {

	

	boolean addPerson(Person person) throws Exception;

	Person getPersonById(String userName) throws Exception;

	Connection getDbConnection() throws Exception;

	



}