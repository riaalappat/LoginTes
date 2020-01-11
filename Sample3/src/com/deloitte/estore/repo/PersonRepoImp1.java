package com.deloitte.estore.repo;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collection;

import java.util.List;



import com.deloitte.estore.model.Person;



public class PersonRepoImp1 implements PersonRepo {


	

	Connection con=null;

	@Override

	public boolean addPerson(Person person) throws Exception {
		
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("insert into person values(?,?)");

		ps.setString(1, person.getUserName());

		ps.setString(2, person.getPassword());


		if(ps.executeUpdate()>0)

			return true;

		return false;

	}


//
//	@Override
//
//	public boolean deleteProduct(Product product) throws Exception {
//
//		Connection con=getDbConnection();
//
//		PreparedStatement ps=con.prepareStatement("delete from product where product_id=?");
//
//		ps.setInt(1,product.getProductId());
//
//		ps.executeUpdate();
//
//			return true;
//
//	
//
//	}
//
//
//
//	@Override
//
//	public boolean updateProduct(Product product) throws Exception {
//
//		Connection con=getDbConnection();
//
//		PreparedStatement ps=con.prepareStatement("update product set product_name=?,price=? where product_id=?");
//
//		ps.setString(1, product.getProductName());
//		ps.setFloat(2, product.getPrice());
//
//		ps.setInt(3, product.getProductId());
//
//		ps.executeUpdate();
//
//			return true;
//
//		
//
//	}
//
//
//
	@Override

	public Person getPersonById(String userName) throws Exception {
		
		Connection con=getDbConnection();

		Statement st=con.createStatement();

	

		ResultSet rs=st.executeQuery("select uname,password from person where uname='"+userName+"'");

	    Person prod=new Person();

	    if(rs.next()) {

	    prod.setUserName(rs.getString(1));

	    prod.setPassword(rs.getString(2));

	    return prod;

	    }

	    return null;

	}

//
//
//	@Override
//
//	public List<Person> getAllPersons() throws Exception {
//
//		Connection con=getDbConnection();
//
//		PreparedStatement pst=con.prepareStatement("select * from person");
//
//		ResultSet rs=pst.executeQuery();
//
//		List<Person> personList=new ArrayList<>();
//
//		while(rs.next())
//
//		{
//
//			Person p=new Person();
//
//			p.setUserName(rs.getString("uname"));
//
//			p.setPassword(rs.getString("password"));
//
//			
//
//			personList.add(p);
//
//		}
//
//		
//
//		
//
//		return personList;
//
//	}
//


	@Override

	public Connection getDbConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");

		return con;

	}



	



//	@Override
//	public boolean deleteProduct(Person person) throws Exception {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//
//	@Override
//	public boolean updateProduct(Person person) throws Exception {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//
//	@Override
//	public List<Person> getAllPersons() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//



}