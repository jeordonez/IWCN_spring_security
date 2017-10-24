package com.master.services;

import com.master.models.Producto;

public interface ProductoService {
	Iterable<Producto> listaproductos();	
	Producto getproductoid(Integer codigo);	
	Producto guardarproducto(Producto prod);	
	void borrarproducto(Integer codigo);
}
