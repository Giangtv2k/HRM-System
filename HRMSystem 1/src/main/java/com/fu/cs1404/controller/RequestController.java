package com.fu.cs1404.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fu.cs1404.entity.Request;
import com.fu.cs1404.repository.RequestRepository;

@Controller
public class RequestController {

	@Autowired
	private RequestRepository requestRepository;

	@RequestMapping(value = { "/requests" }, method = RequestMethod.GET)
	public String request(Model model) {
		List<Request> all = new ArrayList<Request>();
		all = (List<Request>) requestRepository.findAll();
		model.addAttribute("res", all);
		return "requests";
	}

	@RequestMapping(value = { "/addRequest" }, method = RequestMethod.GET)
	public String addRequest(Model model) {
		return "addrequest";
	}


	 @RequestMapping(value = { "/addNewRequest" }, method = RequestMethod.POST)
	 public String addNewRequest(Model model,
		@RequestParam(name= "msnv" )String msnv, 
		@RequestParam(name= "name" )String name,
		@RequestParam(name= "date1")String date1,
		@RequestParam(name= "type" )String type,
		@RequestParam(name= "reason" )String reason,
		@RequestParam(name= "sDate" )String sDate,
		@RequestParam(name= "eDate" )String eDate,
		@RequestParam(name= "approver" )String approver) {
		 
		 
		 
		 
		Request de = new Request();
		de.setStaffId(msnv);
		de.setStaffname(name);
		de.setrDate(date1);
		de.setrType(Integer.parseInt(type));
		de.setrContent(reason);
		de.setsLeave(sDate);
		de.seteLeave(eDate);
		de.setStatus("1");
		de.setApprover(approver);
		de.setNote("");
		
		requestRepository.save(de);
		
		List<Request> all = new ArrayList<Request>();
		all = (List<Request>) requestRepository.findAll();
		model.addAttribute("res", all);
		 
		return "requests"; 
	 
	 }
	 
	 @RequestMapping(value = { "/editRequest" }, method = RequestMethod.GET)
		public String editRequest(Model model,@RequestParam(name= "id" )String id) {
		 	
		 	Request bo = new Request();
		 	bo = requestRepository.getById(Long.parseLong(id));
		 	model.addAttribute("re", bo);
			return "editrequest";
		}


	 @RequestMapping(value = { "/editNewRequest" }, method = RequestMethod.POST)
	 public String editNewBonus(Model model,
		 	@RequestParam(name= "id" )String id, 
			@RequestParam(name= "type" )String type,
			@RequestParam(name= "note" )String note) {
			 
			Request de = new Request();
			de = requestRepository.getById(Long.parseLong(id));
			de.setStatus(type);
			de.setNote(note);
			
			requestRepository.save(de);
			
			List<Request> all = new ArrayList<Request>();
			all = (List<Request>) requestRepository.findAll();
			model.addAttribute("res", all);
	 
		return "requests";
	 
	 }
}
