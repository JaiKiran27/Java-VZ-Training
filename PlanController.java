package com.verizon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Plan;
import com.verizon.service.PlanService;
@RestController
public class PlanController {
	
	@Autowired
	PlanService planService;
	@GetMapping("/plan")
	public List<Plan> getPlanDetails() {
		
		return planService.getPlans();
	}

	
	  @PostMapping("/plan") 
	  public String  addPlanDetails(@RequestBody	  Plan plan) {
		    String result= planService.addPlan(plan);
		  return  result;
	 
	  }
	
	@PutMapping("/plan/{pid}") 
	public Plan updatePlanDetails(@PathVariable("pid") Integer pid,@RequestBody Plan plan) {
		
		return  planService.updatePlan(pid, plan); 
	}
	
	@DeleteMapping("/plan/{pid}") 
	public Plan deletePlanDetails(@PathVariable("pid") Integer pid) {
		
		return  planService.deletePlan(pid);
	}
	
}
