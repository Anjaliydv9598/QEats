package com.jsp.resturant_module.dao;

import com.jsp.resturant_module.model.Resturant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResturantRepository extends JpaRepository<Resturant, Integer> {


}
