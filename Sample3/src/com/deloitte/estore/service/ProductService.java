package com.deloitte.estore.service;



import java.sql.Connection;


import java.util.List;



import com.deloitte.estore.model.Person;



public interface ProductService {

	boolean addPerson(Person person) throws Exception;

//	boolean deleteProduct(Person person)throws Exception;
//
//	boolean updateProduct(Person person) throws Exception;

		Person getPersonById(String userName) throws Exception;
//
//		List<Person> getAllPersons() throws Exception;

	Connection getDbConnection() throws Exception;

}