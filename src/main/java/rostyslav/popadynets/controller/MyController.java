package rostyslav.popadynets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	private String showHome() {
		return "home";
	}
	
}
