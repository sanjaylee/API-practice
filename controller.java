package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Modal.modal;
import com.example.test.Service.service;

@RestController
@RequestMapping("/lee")
@CrossOrigin(origins="*")
public class controller {

	@Autowired
	private service ser;
	
	@PostMapping("/add")
	public modal add(@RequestBody modal le) {
		return ser.savelee(le);
	}
	
  @PostMapping("/onevalue")
  public modal onevalue(@RequestBody modal le) {
	  return ser.one(le);
  }
	

	@PutMapping("/update")
	public String up(@RequestBody modal le) {
		return ser.update(le);
	}
  
	@DeleteMapping("/delete")
	public String dele(@RequestBody modal le) {
		return ser.delete(le);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//    -------------------coustem query------------------------
	
//	@GetMapping("/couName")
//	public List<modal> cus(){
//		return ser.cousName();
//	}
//	
//	@GetMapping("/couuser")
//	public List<modal> user(@RequestBody modal name){
//		return ser.useName(name);
//	}
//	  @GetMapping("/all")
//	  public List<modal> get(){
//		  return ser.all();
//	  }
//	@GetMapping("/count")
//	public long co() {
//		return ser.countmo();
//	}
 }
