package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.DoctorDAO;
import com.springboot.domain.Doctor;
import com.springboot.service.DoctorService;

//Fill your code here
@RestController
public class DoctorController {
	//Fill your code here
	@Autowired
	DoctorService doctorservice;
	@GetMapping("/doctor/list")
	public List<Doctor> getDoctors(){
		//Fill your code here
		return doctorservice.list();

	}
}
