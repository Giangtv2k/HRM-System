package com.fu.cs1404.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fu.cs1404.entity.Salary;
import com.fu.cs1404.repository.SalaryRepository;

@Controller
public class SalaryController {

	@Autowired
	private SalaryRepository salaryRepository;

	@RequestMapping(value = { "/salary" }, method = RequestMethod.GET)
	public String salary(Model model) {
		List<Salary> all = new ArrayList<Salary>();
		all = (List<Salary>) salaryRepository.findAll();
		model.addAttribute("sas", all);
		return "salary";
	}

	@RequestMapping(value = { "/addSalary" }, method = RequestMethod.GET)
	public String addSalary(Model model) {
		return "addsalary";
	}


	 @RequestMapping(value = { "/addNewSalary" }, method = RequestMethod.POST)
	 public String addNewAttendance(Model model,@RequestParam(name= "msnv" )String
	 staffId ,@RequestParam(name= "date" )String aDate,
	 @RequestParam(name= "sTime")String sTime ,
	 @RequestParam(name= "heso" )String heso ,
	 @RequestParam(name= "bonus" )String bonus, 
	 @RequestParam(name= "sumSa" )String sumSa) {
	 
		Salary sa = new Salary();
		sa.setStaffId(staffId);
		sa.setMonth(aDate);
		sa.setsWorkTime(sTime);
		sa.setHeso(heso);
		sa.setBonus(bonus);
		sa.setsSalary(sumSa);
		 
		salaryRepository.save(sa);
		 
		List<Salary> all = new ArrayList<Salary>();
		all = (List<Salary>) salaryRepository.findAll();
		model.addAttribute("sas", all);
		 
		return "salary"; 
	 
	 }
	 
	 @RequestMapping(value = { "/editSalary" }, method = RequestMethod.GET)
		public String editSalary(Model model, @RequestParam(name= "id" )String id) {
		 
		 	Salary sa = new Salary();
		 	sa = salaryRepository.getById(Long.parseLong(id));
		 	model.addAttribute("sa", sa);
			return "editsalary";
		}


		 @RequestMapping(value = { "/editNewSalary" }, method = RequestMethod.POST)
		 public String editNewAttendance(Model model,
				 @RequestParam(name= "id" )String id,
				 @RequestParam(name= "msnv" )String staffId,
				 @RequestParam(name= "date" )String aDate,
				 @RequestParam(name= "sTime")String sTime ,
				 @RequestParam(name= "heso" )String heso ,
				 @RequestParam(name= "bonus" )String bonus, 
				 @RequestParam(name= "sumSa" )String sumSa) {
		 
			Salary sa = new Salary();
			sa.setId(Long.parseLong(id));
			sa.setStaffId(staffId);
			sa.setMonth(aDate);
			sa.setsWorkTime(sTime);
			sa.setHeso(heso);
			sa.setBonus(bonus);
			sa.setsSalary(sumSa);
			 
			salaryRepository.save(sa);
			 
			List<Salary> all = new ArrayList<Salary>();
			all = (List<Salary>) salaryRepository.findAll();
			model.addAttribute("sas", all);
			 
			return "salary"; 
		 
		 }

}
