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

import com.fu.cs1404.entity.Bonus;
import com.fu.cs1404.repository.BonusRepository;

@Controller
public class BonusController {
	@Autowired
	private BonusRepository bonusRepository;

	@RequestMapping(value = { "/bonus" }, method = RequestMethod.GET)
	public String bonus(Model model) {
		List<Bonus> all = new ArrayList<Bonus>();
		all = (List<Bonus>) bonusRepository.findAll();
		model.addAttribute("bos", all);
		return "bonus";
	}

	@RequestMapping(value = { "/addBonus" }, method = RequestMethod.GET)
	public String addBonus(Model model) {
		return "addbonus";
	}


	 @RequestMapping(value = { "/addNewBonus" }, method = RequestMethod.POST)
	 public String addNewBonus(Model model,
		 @RequestParam(name= "msnv" )String staffId, 
		 @RequestParam(name= "date1" )Date aDate,
		 @RequestParam(name= "type")String type,
		 @RequestParam(name= "money" )String money,
		 @RequestParam(name= "note" )String note) {
		 
		Bonus bo = new Bonus();
		bo.setStaffId(staffId);
		bo.setbDate(aDate);
		bo.setbType(type);
		bo.setContent(note);
		bo.setbMoney(money);
		
		bonusRepository.save(bo);
		
		List<Bonus> all = new ArrayList<Bonus>();
		all = (List<Bonus>) bonusRepository.findAll();
		model.addAttribute("bos", all);
		 
		return "bonus"; 
	 
	 }
	 
	 @RequestMapping(value = { "/editBonus" }, method = RequestMethod.GET)
		public String editBonus(Model model,@RequestParam(name= "id" )String id) {
		 	
		 	Bonus bo = new Bonus();
		 	bo = bonusRepository.getById(Long.parseLong(id));
		 	model.addAttribute("bo", bo);
			return "editbonus";
		}


	 @RequestMapping(value = { "/editNewBonus" }, method = RequestMethod.POST)
	 public String editNewBonus(Model model,
			 @RequestParam(name= "id" )String id,
			 @RequestParam(name= "msnv" )String staffId, 
			 @RequestParam(name= "date1" )Date aDate,
			 @RequestParam(name= "type")String type,
			 @RequestParam(name= "money" )String money,
			 @RequestParam(name= "note" )String note) {
			 
		Bonus bo = new Bonus();
		bo.setId(Long.parseLong(id));
		bo.setStaffId(staffId);
		bo.setbDate(aDate);
		bo.setbType(type);
		bo.setContent(note);
		bo.setbMoney(money);
		
		bonusRepository.save(bo);
		
		List<Bonus> all = new ArrayList<Bonus>();
		all = (List<Bonus>) bonusRepository.findAll();
		model.addAttribute("bos", all);
	 
		return "bonus";
	 
	 }
}
