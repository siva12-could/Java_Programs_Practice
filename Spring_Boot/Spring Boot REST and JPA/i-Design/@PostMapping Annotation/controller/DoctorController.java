package com.springboot.controller;

import com.springboot.dao.DoctorDAO;
import com.springboot.domain.Doctor;
import com.springboot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Fill your code here
@RestController
@RequestMapping("/doctor")
public class DoctorController 
{
    //Fill your code here
    @Autowired
    private  DoctorService doctorService;

    @GetMapping("/list")
    public List<Doctor> getDoctors() 
    {
        //Fill your code here
        return doctorService.list();


    }
    @PostMapping("/create")
    //Fill your code here
    public Boolean create(@RequestBody Doctor doctor) 
    {
        //Fill your code here
        return doctorService.save(doctor);

    }
}
