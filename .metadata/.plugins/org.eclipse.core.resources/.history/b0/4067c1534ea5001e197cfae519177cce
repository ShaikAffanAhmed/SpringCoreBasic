package com.example.SampleProject.EmpController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SampleProject.EmpEntity.EmpEn;
import com.example.SampleProject.EmpService.EmpServ;

@RestController
public class EmpControl 
{
   @Autowired
   private EmpServ serv;
   
   @PostMapping("/Insert")
   public EmpEn insert (@RequestBody EmpEn en)
   {
	   System.out.println("mmm"+en);
	   return this.serv.save(en);
   }
   
   @GetMapping("/FetchAll")
   public List<EmpEn>fetchAll()
   {
	   return serv.fetchAllDetails();
   }
   
   @GetMapping("/FindbyId")
   public EmpEn fetchById(@PathVariable Integer Id)
   {
	   return this.serv.fetchById(Id);
   }
   
   @PutMapping("/Update/{Id}")
   public EmpEn update(@PathVariable Integer Id, @RequestBody EmpEn en)
   {
	   return this.serv.update(Id, en);
   }
   
   @DeleteMapping("/Delete/{Id}")
   public void DeleteData(@PathVariable Integer Id)
   {
	   this.serv.delete(Id);
   }
}
