package com.training.control;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.HibernateSpringExample;
import com.training.entity.Students;

@Controller
@RequestMapping("/first.htm")
public class FirstController {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Students student;
	
	@Autowired
	HibernateSpringExample dao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView init(){

		log.info("=====================came======================");
		mdl.setViewName("AddDetails");
		
		mdl.addObject("command",student);
		
		return mdl;
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("student") Students student) {
		
		student.setTotalScore();
		log.info("------------------------------came-----------------");
		
		Long key = (Long)dao.add(student);
		
		log.info("=================="+key);
		mdl.setViewName("Success");
		
		return mdl;
		
	}
	
	
}