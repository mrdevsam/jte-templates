package com.example.jte_templates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JteTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JteTemplatesApplication.class, args);
	}

}

@Controller
@RequestMapping("/")
class IndexController{

	@GetMapping("index")
	public String showIndex() {
		return "pages/index";
	}
}
