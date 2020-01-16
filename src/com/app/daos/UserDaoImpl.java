package com.app.daos;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.RegistrationDetails;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao  {
	
	@Autowired // byType , mandatory
	private SessionFactory sf;
	
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside userdaoimpl");
	}

	@Override
	public RegistrationDetails validateUser(String email, String pass) {
		// TODO Auto-generated method stub
		String jpql="select r from RegistrationDetails r where r.email=:email and r.password=:pass";
		
		return sf.getCurrentSession().createQuery(jpql, RegistrationDetails.class).setParameter("email", email).setParameter("pass", pass).getSingleResult();
	}

	

	
	
	
	

}
