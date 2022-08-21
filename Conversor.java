package com.mateo.tarea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mateo.clase.RespuestaConversor;
@RestController
@RequestMapping
public class Conversor {
	
	@GetMapping("/conv/{a}/{b}") //Ingresar pesos en (a) y valor del dolar hoy en (b)
	public RespuestaConversor convertir (@PathVariable double a, @PathVariable double b) {
		RespuestaConversor res = new RespuestaConversor();
		res.setA(a);
		res.setB(b);
		res.setResultado(a / b);
		return res;
	}

	
}