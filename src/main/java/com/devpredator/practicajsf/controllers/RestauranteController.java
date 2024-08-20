/**
 * 
 */
package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author Nixon
 * Clase controller que se encarga de procesar la informacion para la pantalla restaurantes.xhtml.
 *
 */

@ManagedBean
@ViewScoped

public class RestauranteController {
	/**
	 * Lista de restaurantes para la tabla
	 */

	private List<Restaurante> restaurantes;
	
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de restuarantes
	 */

	
	private RestauranteService restauranteService = new RestauranteService();
	
	/**
	 * Metodo que consulta la lista de restaurante
	 */
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal.
	 */

	
	@PostConstruct
	public void init() {
		
		this.consultarRestaurantes();
		
	}
	
	public void consultarRestaurantes() {
		
		this.restaurantes = this.restauranteService.consultarRestaurantes();
		
	}
	
	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
	
	

}
