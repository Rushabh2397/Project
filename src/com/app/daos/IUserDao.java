package com.app.daos;

import com.app.pojos.RegistrationDetails;

public interface IUserDao {
	RegistrationDetails validateUser (String email, String pass);
}
