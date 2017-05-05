package br.com.price.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/")
	public String index(){
		System.out.println("Controle");
		return "home";
	}
}
