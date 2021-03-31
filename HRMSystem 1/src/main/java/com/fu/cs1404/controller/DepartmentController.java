package com.fu.cs1404.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fu.cs1404.entity.Department;
import com.fu.cs1404.repository.DepartmentRepository;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;

	@RequestMapping(value = { "/department" }, method = RequestMethod.GET)
	public String department(Model model) {
		List<Department> all = new ArrayList<Department>();
		all = (List<Department>) departmentRepository.findAll();
		model.addAttribute("des", all);
		return "department";
	}

	@RequestMapping(value = { "/addDepartment" }, method = RequestMethod.GET)
	public String addBonus(Model model) {
		return "adddepartment";
	}


	 @RequestMapping(value = { "/addNewDepartment" }, method = RequestMethod.POST)
	 public String addNewBonus(Model model,
		 @RequestParam(name= "mpb" )String mpb, 
		 @RequestParam(name= "name" )String dName,
		 @RequestParam(name= "note")String dNote,
		 @RequestParam(name= "manager" )String manager) {
		 
		Department de = new Department();
		de.setdId(mpb);
		de.setdName(dName);
		de.setdNote(dNote);
		de.setdManager(manager);
		
		departmentRepository.save(de);
		
		List<Department> all = new ArrayList<Department>();
		all = (List<Department>) departmentRepository.findAll();
		model.addAttribute("des", all);
		 
		return "department"; 
	 
	 }
	 
	 @RequestMapping(value = { "/editDepartment" }, method = RequestMethod.GET)
		public String editDepartment(Model model,@RequestParam(name= "id" )String id) {
		 	
		 	Department bo = new Department();
		 	bo = departmentRepository.getById(Long.parseLong(id));
		 	model.addAttribute("de", bo);
			return "editdepartment";
		}


	 @RequestMapping(value = { "/editNewDepartment" }, method = RequestMethod.POST)
	 public String editNewBonus(Model model,
			 @RequestParam(name= "id" )String id, 
			 @RequestParam(name= "mpb" )String mpb, 
			 @RequestParam(name= "name" )String dName,
			 @RequestParam(name= "note")String dNote,
			 @RequestParam(name= "manager" )String manager) {
			 
			Department de = new Department();
			de.setId(Long.parseLong(id));
			de.setdId(mpb);
			de.setdName(dName);
			de.setdNote(dNote);
			de.setdManager(manager);
			
			departmentRepository.save(de);
			
			List<Department> all = new ArrayList<Department>();
			all = (List<Department>) departmentRepository.findAll();
			model.addAttribute("des", all);
	 
		return "department";
	 
	 }
}
