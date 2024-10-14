package com.example.jte_templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JteTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JteTemplatesApplication.class, args);
	}

}

@Controller
@RequestMapping("/v1/")
class IndexController{

	@GetMapping("index")
	public String showIndex() {
		return "pages/index";
	}
}

@Controller
class TemplateController{

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("username", "jon-doe");
		return "pages/home";
	}
}
