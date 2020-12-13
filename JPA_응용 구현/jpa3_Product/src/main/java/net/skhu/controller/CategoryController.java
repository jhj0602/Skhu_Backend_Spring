package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.repository.CategoryRepository;

@Controller

public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	

	@RequestMapping("product/list1")
	public String list1(Model model) {
		model.addAttribute("categorys", categoryRepository.findAll());
		return "product/list1";
	}

	@RequestMapping("product/list2")
	public String list2(Model model) {
		model.addAttribute("categorys", categoryRepository.findAll());
		return "product/list2";
	}

	
}