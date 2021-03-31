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

import com.fu.cs1404.entity.Attendance;
import com.fu.cs1404.repository.AttendanceRepository;

@Controller
public class AttendanceController {

	@Autowired
	private AttendanceRepository attendanceRepository;
	
	@RequestMapping(value = { "/attendance" }, method = RequestMethod.GET)
	public String attendance(Model model) {
		List<Attendance> all = new ArrayList<Attendance>();
		all = (List<Attendance>) attendanceRepository.findAll();
		model.addAttribute("atens", all);
		return "attendance";
	}
	
	@RequestMapping(value = { "/addattendance" }, method = RequestMethod.GET)
	public String addattendance(Model model) {
		return "addattendance";
	}
	
	@RequestMapping(value = { "/addNewAttendance" }, method = RequestMethod.POST)
	public String addNewAttendance(Model model,@RequestParam(name= "msnv" )String staffId
			,@RequestParam(name= "date" )Date aDate
			,@RequestParam(name= "sHour" )String sHour
			,@RequestParam(name= "eHour" )String eHour
			,@RequestParam(name= "wTime" )String wTime) {
		
		Attendance at = new Attendance();
		at.setuId(staffId);
		at.setDmm(staffId);
		at.setaDate(aDate);
		at.setsHour(sHour);
		at.seteHour(eHour);
		at.setWorkTime(wTime);
		
		attendanceRepository.save(at);
		
		List<Attendance> all = new ArrayList<Attendance>();
		all = (List<Attendance>) attendanceRepository.findAll();
		model.addAttribute("atens", all);
		return "attendance";
	}
	
	@RequestMapping(value = { "/editAttendance" }, method = RequestMethod.GET)
	public String editAttendance(Model model,@RequestParam(name= "id" )String id) {
		Attendance at = new Attendance();
		at = attendanceRepository.getById(Long.parseLong(id));
		model.addAttribute("at", at);
		return "editattendance";
	}
	
	@RequestMapping(value = { "/editNewAttendance" }, method = RequestMethod.POST)
	public String editNewAttendance(Model model,@RequestParam(name= "msnv" )String staffId
			,@RequestParam(name= "date" )Date aDate
			,@RequestParam(name= "sHour" )String sHour
			,@RequestParam(name= "eHour" )String eHour
			,@RequestParam(name= "wTime" )String wTime
			,@RequestParam(name= "id" )String id) {
		
		Attendance at = new Attendance();
		at.setId(Long.parseLong(id));
		at.setuId(staffId);
		at.setDmm(staffId);
		at.setaDate(aDate);
		at.setsHour(sHour);
		at.seteHour(eHour);
		at.setWorkTime(wTime);
		
		attendanceRepository.save(at);
		
		List<Attendance> all = new ArrayList<Attendance>();
		all = (List<Attendance>) attendanceRepository.findAll();
		model.addAttribute("atens", all);
		return "attendance";
	}
	
}
