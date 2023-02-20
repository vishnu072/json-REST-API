package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	private String yourFavColour="Green";
	@GetMapping("/")
	public String getMyFav() {
		return "My favourite colour is  " + yourFavColour;
	}
}