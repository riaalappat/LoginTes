package com.deloitte.estore.service;



import java.sql.Connection;


import java.util.List;

import com.deloitte.estore.model.Person;

import com.deloitte.estore.repo.PersonRepo;
import com.deloitte.estore.repo.PersonRepoImp1;






public class ProductServiceImpl implements ProductService {



    PersonRepo repo;

    public ProductServiceImpl() {

    	repo=new PersonRepoImp1();

    }

	@Override

	public boolean addPerson(Person person) throws Exception {

		

		return repo.addPerson(person);

	}



	



	@Override

	public Person getPersonById(String userName) throws Exception {

		// TODO Auto-generated method stub

		return repo.getPersonById(userName);

	}


//
//	@Override
//
//	public List<Person> getAllPersons() throws Exception {
//
//		// TODO Auto-generated method stub
//
//		return repo.getAllPersons();
//
//	}
//
//
//
//	
//	@Override
//	public boolean deleteProduct(Person person) throws Exception {
//		// TODO Auto-generated method stub
//		return repo.deleteProduct(person);
//	}
//
//	@Override
//	public boolean updateProduct(Person person) throws Exception {
//		// TODO Auto-generated method stub
//		return repo.deleteProduct(person);
//	}

	@Override

	public Connection getDbConnection() throws Exception {

		// TODO Auto-generated method stub

		return null;

	}


}