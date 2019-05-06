package com.humberto.service;

import java.util.List;

import com.humberto.entity.CheckPoint;;

public interface CheckPointService {

	public List getAllCheckPoints();

	public CheckPoint getCheckPointById(Long id);

	public boolean saveCheckPoint(CheckPoint checkPoint);

	public boolean deleteCheckPointById(Long id);

}