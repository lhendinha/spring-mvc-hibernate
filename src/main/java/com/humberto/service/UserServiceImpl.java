package com.humberto.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humberto.entity.User;
import com.humberto.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	private UserRepository repository;

	@PersistenceContext
	EntityManager entityManager;

	public UserServiceImpl() {

	}

	@Autowired
	public UserServiceImpl(UserRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List getAllUsers() {
		List list = new ArrayList();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public User getUserById(Long id) {
		User user = repository.findById(id).get();
		return user;
	}

	@Override
	public User login(String userName, String password) {

		if (!userName.isEmpty() && !password.isEmpty()) {
			Query query = entityManager.createNativeQuery(
					"SELECT * FROM user " + "WHERE userName = '" + userName + "' AND password = '" + password + "'",
					User.class);

			return (User) query.getSingleResult();
		} else {
			User user = new User();
			return user;
		}
	}

	@Override
	public boolean saveUser(User user) {
		try {
			repository.save(user);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteUserById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

}
