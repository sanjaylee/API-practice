package com.example.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Modal.modal;
import com.example.test.Repository.repository;

@Service
public class service {

	@Autowired
	private repository repo;
	
	public modal savelee(modal le) {
		return repo.save(le);
	}	
		
   
		
	public modal one(modal le) {
		return repo.findById(le.getId()).get();
	}
	
	
	
	public String update(modal le) {
		
	  if(le.getId()!=0) {
		  modal mo=repo.findById(le.getId()).get();
		  mo.setName(le.getName());
		  mo.setSalary(le.getSalary());
		  mo.setCity(le.getCity());
		  repo.save(mo);
	  }else {
		  return "user not found";
	  }
	  return "update successfully";
	}
	
	
	public String delete(modal le) {
		if(le.getId()!=0) {
			repo.delete(le);
		}else {
			return "id not found";
		}
		return "delete successfull";
	}
	
	
	 public List<modal> all(){
	    	return repo.findAll();
	    }

	
	public long countmo() {
		return  repo.count();
	}
	
	public List<modal> cousName(){
		return repo.selectName();
	}
	
	public List<modal> useName(modal name){
		return repo.selectuser(name.getName());
	}
	

	
	public modal sa(modal sa) {
		return repo.save(sa);
	}
	
	public List<modal> full(){
		return repo.findAll();
	}
	
	
	public modal oer(modal sa) {
		return repo.findById(sa.getId()).get();
	}
	
	public String up(modal sa) {
		if(sa.getId()!=0) {
			modal le=repo.findById(sa.getId()).get();
			le.setName(sa.getName());
			le.setSalary(sa.getSalary());
			le.setCity(sa.getCity());
			repo.save(le);
		}else {
			return "update not success";
		}
		return "update succes";
	}
	
	
	public String de(modal sa) {
		if(sa.getId()!=0) {
			repo.delete(sa);
		}else {
			return "not done";
		}
		return "delete done";
	}
	
}
