package com.humberto.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humberto.entity.CheckPoint;
import com.humberto.repository.CheckPointRepository;

@Service
@Transactional
public class CheckPointServiceImpl implements CheckPointService {

	// Implementing Constructor based DI
	private CheckPointRepository repository;

	public CheckPointServiceImpl() {

	}

	@Autowired
	public CheckPointServiceImpl(CheckPointRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List getAllCheckPoints() {
		List list = new ArrayList();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public CheckPoint getCheckPointById(Long id) {
		CheckPoint user = repository.findById(id).get();
		return user;
	}

	@Override
	public boolean saveCheckPoint(CheckPoint checkPoint) {
		try {
			repository.save(checkPoint);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteCheckPointById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

}
