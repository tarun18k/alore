package com.AlorePTE.HotelManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.AlorePTE.HotelManagement.Entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, Integer>,JpaSpecificationExecutor<Hotel>{
	
	List<Hotel> findByCity(String city);
 
}
