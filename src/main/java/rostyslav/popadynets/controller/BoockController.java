package rostyslav.popadynets.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rostyslav.popadynets.entity.Boock;
import rostyslav.popadynets.service.BoockService;

@Controller
@RequestMapping("/boocks")
public class BoockController {

	@Autowired
	BoockService boockService;
	
	@GetMapping("/addBoock")
	public String addBoocks() {
		return "boock/addBoock";
	}

	@PostMapping("/add-boock")
	public String addBoock(@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("numberOfBoock") String numberOfBoock,
			@RequestParam("price") BigDecimal price
			) {
		
		Boock boock = Boock.builder().title(title).description(description.toString())
				.numberOfBoock(numberOfBoock).price(price).build();
		boockService.addBoock(boock);
		return "redirect:/boocks/loockAllBoock";
	}
	
	@GetMapping("/loockAllBoock")
	public String boockList(Model model) {
		List<Boock> boocks = boockService.loockAllBoocks();
		model.addAttribute("allBoock", boocks);
		return "/boock/loockAllBoock";
	}
	
	@GetMapping("/showBoock/{boockId}")
	public String showBoock(@PathVariable("boockId") Long id,
			Model model
			) {
		Boock boock = boockService.detalInfBoock(id);
		model.addAttribute("boockInfo", boock);
		return "boock/showBoock";
	}
	
	@GetMapping("/deleteBoock/{boockId}")
	public String deleteBoock(@PathVariable("boockId") Long id) {
		boockService.deleteBoock(id);
		return "redirect:/boocks/loockAllBoock";
	}
	
}
