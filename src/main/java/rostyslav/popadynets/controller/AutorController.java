package rostyslav.popadynets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rostyslav.popadynets.entity.Autor;
import rostyslav.popadynets.service.AutorService;

@Controller
@RequestMapping("/autors")
public class AutorController {
	@Autowired
	AutorService autorService;
	
	@GetMapping("/addAutor")
	public String addBoocks() {
		return "autor/addAutor";
	}

	@PostMapping("/add-autor")
	public String addBoock(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("age") String age
			) {
		Autor autor = Autor.builder().firstName(firstName).lastName(lastName)
				.email(email).age(age).build();
		autorService.addAutor(autor);
		return "redirect:/autors/loockAllAutor";
	}
	
	@GetMapping("/loockAllAutor")
	public String autorList(Model model) {
		List<Autor> autors = autorService.loockAllAutors();
		model.addAttribute("allAutor", autors);
		return "/autor/loockAllAutor";
	}
	
	@GetMapping("/showAutor/{autorId}")
	public String showBoock(@PathVariable("autorId") Long id,
			Model model
			) {
		Autor autor = autorService.detalInfAutor(id);
		model.addAttribute("autorInfo", autor);
		return "autor/showAutor";
	}
	
	@GetMapping("/deleteAutor/{autorId}")
	public String deleteAutor(@PathVariable("autorId") Long id) {
		autorService.deleteAutor(id);
		return "redirect:/autors/loockAllAutor";
	}
}
