package com.forum.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.forum.web.model.Users;

@Repository
public class UserDaoImpl extends AbstractDao<Integer, Users> implements UserDao{

	public Users findById(int id) {
		return findById(id);
	}

	@SuppressWarnings("unchecked")
	public List<Users> findAllUsers() {
		Criteria criteria = createEntityCriteria();
		
		return (List<Users>) criteria.list();
	}

	public void save(Users user) {
		persist(user);
	}

	public void delete(Users user) {
		delete(user);
	}
	public Users findByEmail(String email){
		return findByEmail(email);
	}

}
