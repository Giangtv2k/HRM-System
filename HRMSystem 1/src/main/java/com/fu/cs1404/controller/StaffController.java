package com.fu.cs1404.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fu.cs1404.entity.Staff;
import com.fu.cs1404.repository.StaffRepository;

@Controller
public class StaffController {

	@Autowired
	private StaffRepository staffRepository;
	
	@RequestMapping(value = { "/custommer"}, method = RequestMethod.GET)
	public String home(Model model) {
		List<Staff> all = new ArrayList<Staff>();
		all = staffRepository.findAll();
		model.addAttribute("staffs", all);
		return "custommer";
	}
	
	@RequestMapping(value = { "/addUser"}, method = RequestMethod.GET)
	public String addUser(Model model) {
		return "addUser";
	}
	
	@RequestMapping(value = { "/editNewUser"}, method = RequestMethod.GET)
	public String editUser(Model model,@RequestParam(name= "sid" )String staffId) {
		
		Staff staff = new Staff();
		staff = staffRepository.getById(Long.parseLong(staffId));
		model.addAttribute("staff", staff);
		return "editUser";
	}
	
	@RequestMapping(value = { "/editUser"}, method = RequestMethod.POST)
	public String editUser(Model model,@RequestParam(name= "msnv" )String staffId,
			@RequestParam(name= "id" )String id,
			@RequestParam(name= "name" )String staffname,
			@RequestParam(name= "gender" )String gender,
			@RequestParam(name= "bod" )Date bod,
			@RequestParam(name= "add" )String add,
			@RequestParam(name= "depart" )String department,
			@RequestParam(name= "stafflv" )String office) {
		
		Staff staff = new Staff();
		staff.setId(Long.parseLong(id));
		staff.setStaffId(staffId);
		staff.setStaffname(staffname);
		staff.setAddress(add);
		staff.setBod(bod);
		staff.setDepartment(department);
		staff.setOffice(office);
		staff.setGender(gender);
		staff.setPhone("");
		staff.setsDate(null);
		
		staffRepository.save(staff);
		List<Staff> all = new ArrayList<Staff>();
		all = staffRepository.findAll();
		model.addAttribute("staffs", all);
		return "custommer";
	}
	
	@RequestMapping(value = { "/addNewUser"}, method = RequestMethod.POST)
	public String addNewUser(Model model,@RequestParam(name= "msnv" )String staffId,
			@RequestParam(name= "name" )String staffname,
			@RequestParam(name= "gender" )String gender,
			@RequestParam(name= "bod" )Date bod,
			@RequestParam(name= "add" )String add,
			@RequestParam(name= "depart" )String department,
			@RequestParam(name= "stafflv" )String office) {
		
		Staff staff = new Staff();
		staff.setStaffId(staffId);
		staff.setStaffname(staffname);
		staff.setAddress(add);
		staff.setBod(bod);
		staff.setDepartment(department);
		staff.setOffice(office);
		staff.setGender(gender);
		staff.setPhone("");
		staff.setsDate(null);
		
		staffRepository.save(staff);
		
		List<Staff> all = new ArrayList<Staff>();
		all = staffRepository.findAll();
		model.addAttribute("staffs", all);
		
		return "custommer";
	}
}
