package com.master;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.master.models.Producto;
import com.master.models.Usuario;
import com.master.repositorios.ProductoRepositorio;
import com.master.repositorios.UsuarioRepositorio;

@Component
public class Carga implements ApplicationListener<ContextRefreshedEvent> {
	private UsuarioRepositorio usrepo;
	private ProductoRepositorio producRepo;

	@Autowired
	public void setporductoRepositorio(ProductoRepositorio productoRepo) {
		this.producRepo = productoRepo;
	}
	
	@Autowired
	public void setUserRepositorio(UsuarioRepositorio userRepositorio) {
		this.usrepo = userRepositorio;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		GrantedAuthority[] userRoles = { new SimpleGrantedAuthority("ROLE_USER") };
		usrepo.save(new Usuario("user","user", Arrays.asList(userRoles)));
		
		GrantedAuthority[] adminRoles = { new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ADMIN_USER") };
		usrepo.save(new Usuario("admin","admin", Arrays.asList(adminRoles)));
		
		Producto producto1 = new Producto();
		producto1.setNombre("manzana");
		producto1.setDescripcion("producto comestible");
		producto1.setPrecio(1);
		producRepo.save(producto1);
		
		Producto producto2 = new Producto();
		producto2.setNombre("pera");
		producto2.setDescripcion("producto comestible");
		producto2.setPrecio(2);
		producRepo.save(producto2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	producto producto1 = new producto();
	producto producto2 = new producto();
	producto producto3 = new producto();
	producto producto4 = new producto();
	List<producto> productos;
	
	
	public List<producto> getListProductos(){
	
	producto1.setCodigo(1);
	producto1.setNombre("manzana");
	producto1.setDescripcion("producto comestible");
	producto1.setPrecio(2);
	
	producto2.setCodigo(2);
	producto2.setNombre("sandia");
	producto2.setDescripcion("producto comestible");
	producto2.setPrecio(1);
	
	producto3.setCodigo(3);
	producto3.setNombre("pera");
	producto3.setDescripcion("producto comestible");
	producto3.setPrecio(5);
	
	producto4.setCodigo(4);
	producto4.setNombre("coca cola");
	producto4.setDescripcion("producto comestible");
	producto4.setPrecio(1);

	return productos = Arrays.asList(producto1, producto2, producto3, producto4);
	
	}
	*/

}
