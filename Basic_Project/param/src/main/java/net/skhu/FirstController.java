package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
	@RequestMapping("test1") // 여기에 request parameter 값이 없다면 서버는 400 HTTP response를 출력한다.
	public String test1(Model model, @RequestParam("id") int id, @RequestParam("name") String name) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "first/test1";
	}

	@RequestMapping("test2")//required =false 이므로 id 이름의 request parameter가 Http request에 담겨 있지 않아도 에러 발생 x
	public String test2(Model model, @RequestParam(value = "id", required = false, defaultValue = "0") int id,
                      //defaultValue 속성으로 지정한 값이 , 파라미터 변수에 대입된다.
			@RequestParam(value = "name", required = false, defaultValue = "nobody") String name) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "first/test1";
	}

	@RequestMapping("test3")
	public String test3(Model model, int id, String name) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "first/test1";
	}
}