package com.hafiz.spring.springfreemarker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller    // This means that this class is a Controller
@RequestMapping(path="/page") // This means URL's start with /demo (after Application path)
public class SamplePage {

	
	@GetMapping(path="/freemarker")
	public String showPage(Model model) {
		

		List<String> list = new ArrayList<String>();
		for (int i=10 ; i>0 ; i--) {			
			list.add("Item" + i);
	    }
		

		model.addAttribute("merchantName", "Toko Mudah Barokah");
		model.addAttribute("items", list);

		return "tplpage";
		
	}		
	
}
