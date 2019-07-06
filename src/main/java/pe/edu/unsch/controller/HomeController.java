package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeController {
	
	@GetMapping("/home")
	public String index(Model model) {
		model.addAttribute("title", "Home | EvaluaciÃ³n 360Â°");
		return "views/admin/home/index";
	}

}