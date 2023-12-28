package com.example.SampleProject.EmpRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleProject.EmpEntity.EmpEn;

@Repository
public interface EmpRepo extends JpaRepository<EmpEn, Integer>{

}
