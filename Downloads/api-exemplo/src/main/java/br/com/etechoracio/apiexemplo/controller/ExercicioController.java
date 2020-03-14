package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping ("/exercicios")
@RestController
public class ExercicioController {

	@GetMapping ("/dobro")
	public int dobro (@RequestParam ("num") int num) {
		return num *2;
	}
	
	@GetMapping ("/potencia") 
	public double potencia (@RequestParam ("num1") int  num1,
						 @RequestParam ("num2") int num2) {
		return Math.pow(num1, num2);
	}
	
	@GetMapping ("raizquadrada") 
	public double raizquadrada (@RequestParam ("num") int num) {
		return Math.sqrt(num);
	}
}
