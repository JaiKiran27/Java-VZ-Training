package com.verizon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.model.Plan;

@Repository
//@Component
public interface PlanDao  extends JpaRepository<Plan,Integer>{

}
