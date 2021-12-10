package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Peopledao;
import com.example.demo.model.People;


@Controller
public class PeopleController {

	@Autowired
	People people;
	@Autowired
	Peopledao peopledao;
	String msg;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("people", people);
		model.addAttribute("msg", msg);
		return "index";
	}
	@RequestMapping("validate")
	public String validate(@ModelAttribute("people") People people,  Model mv) {
		People p=peopledao.validatePeople(people);
		if(p!=null) {
			System.out.println("Login successful");
			msg= "Login successful";
			return "redirect:/getall";
		}
		else {
			System.out.println("Login failed");
			msg= "Login failed";
			return "redirect:/home";
		}
	}
	@RequestMapping("/registeration")
	public String showRegisterationForm(Model model) {
		model.addAttribute("people", people);
		return "registeration";
	}
	@RequestMapping("submitform")
	public ModelAndView savePeople(@ModelAttribute("people") People people, ModelAndView mv) throws IOException {
		
		peopledao.addPeople(people);
		mv.addObject("msg", "Person Added Successfully");
		
		mv.setViewName("registeration");
		return mv;
	}
	@RequestMapping("getall")
	public ModelAndView getAllPeople(ModelAndView mv) {
		List<People> peopleList = peopledao.getAllPeople();
		mv.addObject("people", peopleList);
		mv.addObject("msg", msg);
		mv.setViewName("viewperson");
		return mv;
	}
	@RequestMapping("getpeopleform")
	public String getPeopleForm() {
		return "getperson";
	}
	@RequestMapping("getbyid")
	public ModelAndView getById(@RequestParam("id") int id, ModelAndView mv) {
		People people = peopledao.getPeopleById(id);
		mv.addObject("people", people);
		mv.setViewName("showpeople");
		return mv;
	}
	
	@RequestMapping("updatepeople/{id}")
	public String getUpdatePeople(@PathVariable int id, Model m) {
		
		People people= peopledao.getPeopleById(id);
		System.out.println("In Controller : "+people);
		m.addAttribute("people", people);
		return "/updateform";
		
	}
	
	@RequestMapping("saveupdate")
	public String saveUpdate(@ModelAttribute("people") People people) {
		peopledao.updatePeople(people);
		return "redirect:/getall";
		
	}
	
	@RequestMapping("deletepeople/{id}")
	public String deletePeople(@PathVariable int id) {
		peopledao.deletePeople(id);
		return "redirect:/getall";
	}
}
