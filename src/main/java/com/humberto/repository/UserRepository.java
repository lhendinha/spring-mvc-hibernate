package com.humberto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.humberto.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}