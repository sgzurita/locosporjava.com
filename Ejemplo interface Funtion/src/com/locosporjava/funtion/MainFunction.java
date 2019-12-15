package com.locosporjava.funtion;

import java.util.function.Function;

public class MainFunction {
	
	public static void main(String[] args) {
		int numArticulos=10;
		PuntoVenta puntoVenta=new PuntoVenta("OkPan","El Cairo");
		Articulo pan=new Articulo("pan",0.60F,puntoVenta); 
	    Function<Articulo, Float> precio=articulo->articulo.getPrecio();
		precio=precio.andThen(it->it+numArticulos);
		System.out.println("el precio final es"+precio.apply(pan));
		
		//En el caso que quisieramos el nombre del articulo en
		Function<Articulo,PuntoVenta> x=art-> art.getPuntoVenta();
		Function<PuntoVenta,String>pv=art->art.getCiudad();
		pv.compose((x));
		System.out.println(pv.compose(x).apply(pan));
		
		java.util.function.Consumer<Articulo> consumer=art->{
			art.setNombre("ok pan "+art.getNombre());
			art.setPrecio(art.getPrecio()*1.10F);
		};
		
		consumer.accept(pan);
		System.out.println(pan.getNombre()+" "+pan.getPrecio()
		);
		

	}
}
