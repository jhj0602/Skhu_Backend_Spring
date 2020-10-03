package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("third")
public class ThirdController {
	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student(11111, "201534027", "진형준스프링", "jnh03231@naver.com");
		model.addAttribute("student", student);
		return "third/test1";
	}

	@RequestMapping(value = "test2", method = RequestMethod.GET)
	public String test2(Model model) {
		model.addAttribute("student", new Student());
		return "third/test2";
	}

	@RequestMapping(value = "test2", method = RequestMethod.POST)
	public String test2(Model model, Student student) {
// TODO: 저장하는 코드를 구현해야 함.
		model.addAttribute("message", "저장되었습니다");
		return "third/test2";
	}
}
