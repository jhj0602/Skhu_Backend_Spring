package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import net.skhu.repository.DistrictRepository;

@Controller
public class DistrictController {
	@Autowired
	DistrictRepository districtRepository;

	@RequestMapping("city/list1")
	public String list1(Model model) {
		model.addAttribute("districts", districtRepository.findAll());
		return "city/list1";
	}

	@RequestMapping("city/list2")
	public String list2(Model model) {
		model.addAttribute("districts", districtRepository.findAll());
		return "city/list2";
	}
}