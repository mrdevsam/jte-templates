package com.example.jte_templates;

import java.util.Arrays;
import java.util.List;

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
		System.out.println("inside -home");
		model.addAttribute("username", "jon-doe");
		return "pages/home";
	}

	@GetMapping("/team")
	public String team(Model model) {
		System.out.println("inside -team");
		List<String> members = Arrays.asList("MrA", "MrB", "MrC", "MrD");
		model.addAttribute("memberList", members);
		return "pages/team";
	}

	@GetMapping("projects")
	public String projects(Model model) {
		System.out.println("inside -projects");
		List<String> projects = List.of("Project 1", "Project 2", "Project 3");
		model.addAttribute("projectList", projects);
		return "pages/projects";
	}
}
