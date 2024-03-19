package com.example.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.test.Modal.modal;

@Repository
public interface repository extends JpaRepository<modal, Integer> {


@Query(value="select * from lee where l_name='sanjay'" , nativeQuery =true)	
  List<modal> selectName();
  
  @Query(value="select * from lee where l_name= :name" , nativeQuery =true)	
  List<modal> selectuser(@Param (value="name") String name);
}
