package com.example.SampleProject.EmpService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SampleProject.EmpEntity.EmpEn;
import com.example.SampleProject.EmpRepository.EmpRepo;

@Service
public class EmpServ 
{
   @Autowired
   private EmpRepo repo;

public EmpEn save(EmpEn en) {
	// TODO Auto-generated method stub
	return this.repo.save(en);
}

public List<EmpEn> fetchAllDetails() {
	// TODO Auto-generated method stub
	return this.repo.findAll();
}

public EmpEn fetchById(Integer id) {
	// TODO Auto-generated method stub
	return this.repo.findById(id).orElse(null);
}

public EmpEn update(Integer id, EmpEn en) {
	// TODO Auto-generated method stub
	
	if(repo.existsById(id))
	{
		en.setEmpId(id);
		en.setEmpName("Shaik");
		en.setEmpEmail("Shaik@gmail.om");	
		this.repo.save(en);
	}
	return en;
}

public void delete(Integer id) {
	// TODO Auto-generated method stub
	EmpEn empEn=this.repo.findById(id).orElse(null);
	 this.repo.delete(empEn);
}

}
