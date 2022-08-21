package com.mateo.clase;

public class RespuestaConversor {
	private String saludo = "Bienvenido(a) ingrese los pesos y el valor del dolar hoy";
	private double a;
	private double b;
	private double resultado;
	private String error = "Conversion de pesos a dolares realizada correctamente";
	

	public RespuestaConversor () {
	}
	
	public RespuestaConversor(double x, double y, double z) {
		this.a = x;
		this.b = y;
		this.resultado = z;
	}

	public RespuestaConversor(double x, double y, String msj) {
		this.a = x;
		this.b = y;
		this.error = msj;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getA() {
		return (int) a;
	}

	public void setA(double a2) {
		this.a = a2;
	}

	public int getB() {
		return (int) b;
	}

	public void setB(double b2) {
		this.b = b2;
	}

	public int getResultado() {
		return (int) resultado;
	}

	public void setResultado(double d) {
		this.resultado = d;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
