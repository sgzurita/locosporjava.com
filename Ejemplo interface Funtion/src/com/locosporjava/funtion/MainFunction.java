package com.locosporjava.funtion;

import java.util.function.Function;

public class MainFunction {
	public static void main(String[] args) {
		int numArticulos=10;
		Articulo pan=new Articulo("pan",0.60F); 
	    Function<Articulo, Float> precio=articulo->articulo.getPrecio();
		precio=precio.andThen(it->it+numArticulos);
		System.out.println("el precio final es"+precio.apply(pan));

	}
}
