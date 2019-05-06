package com.humberto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.humberto.entity.CheckPoint;;

@Repository
public interface CheckPointRepository extends CrudRepository<CheckPoint, Long> {

}