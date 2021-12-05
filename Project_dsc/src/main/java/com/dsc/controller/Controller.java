package com.dsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsc.bean.DoubleValuedDS;
import com.dsc.service.DoubleValuedInterface;


@RestController
public class Controller {
	@Autowired
	private DoubleValuedInterface valuedInterface;
	@GetMapping(path = "get/{id}")
	public DoubleValuedDS getDoubleValuedIntegerById(@PathVariable("id") Integer Id) {
		DoubleValuedDS vs= valuedInterface.findInDatabase(Id);
		return vs;
	}
	@PostMapping(path="/add")
	public String postDoubleValueIntegerById(@RequestBody DoubleValuedDS ds) {
		return valuedInterface.addInDatabase(ds)?"successful":"not successful";
	}
}
