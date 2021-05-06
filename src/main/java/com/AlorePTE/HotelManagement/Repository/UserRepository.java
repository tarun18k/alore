package com.AlorePTE.HotelManagement.Repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.AlorePTE.HotelManagement.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer>,JpaSpecificationExecutor<User>{

}
