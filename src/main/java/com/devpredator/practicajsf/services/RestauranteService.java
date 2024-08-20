/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author Nixon
 * 
 * 
 *
 */
public class RestauranteService {
	/**
	 * Metodo que permite consultar la lista de restaurantes.
	 * @return {link Empleado} lista de restaurantes
	 */

	
//	public List<Gerente>  consultarGerentes() {
//		//Generar la lista de gerentes a consultar
//		
//		List<Gerente> gerentes = new ArrayList<Gerente>();
//		
//		Gerente gerenteMcDonals = new Gerente();
//		Gerente gerenteLaVidArgentina = new Gerente();
//		Gerente gerenteLaChilaca = new Gerente();
//		Gerente gerenteCienaga = new Gerente();
//		Gerente gerenteSocarrat = new Gerente();
//		
//		gerenteMcDonals.setNombre("Diego");
//		gerenteMcDonals.setPrimerApellido("Paniagua");
//		gerenteMcDonals.setSegundoApellido("López");
//
//		gerenteLaVidArgentina.setNombre("Erick");
//		gerenteLaVidArgentina.setPrimerApellido("Guerrero");
//		gerenteLaVidArgentina.setSegundoApellido("Gómez");
//
//		gerenteLaChilaca.setNombre("Luis Jesus");
//		gerenteLaChilaca.setPrimerApellido("López");
//		gerenteLaChilaca.setSegundoApellido("Romero");
//
//		gerenteCienaga.setNombre("Emilio");
//		gerenteCienaga.setPrimerApellido("Castillo");
//		gerenteCienaga.setSegundoApellido("Merino");
//
//		gerenteSocarrat.setNombre("Nixon");
//		gerenteSocarrat.setPrimerApellido("Castillo");
//		gerenteSocarrat.setSegundoApellido("Jiménez");
//
//		return gerentes;
//		
//	}
//	
	public List<Restaurante> consultarRestaurantes(){
		
		//Generar la lista de restaurantes a consultar
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		
		Restaurante restauranteMcDonals = new Restaurante();
		Restaurante restauranteLaVidArgentina = new Restaurante();
		Restaurante restauranteLaChilaca = new Restaurante();
		Restaurante restauranteCienaga = new Restaurante();
		Restaurante restauranteSocarrat = new Restaurante();
		
		
//		Gerente gerenteMcDonals = new Gerente();


		
		//:::::::: PRIMER RESTAURANTE ::::::::::::::

		restauranteMcDonals.setNombre("McDonals");
		restauranteMcDonals.setDireccion("Direccion1");
		restauranteMcDonals.setPais("Estados Unidos");

		Gerente gerenteMcDonals = new Gerente();
		gerenteMcDonals.setNombre("Diego");
		gerenteMcDonals.setPrimerApellido("Paniagua");
		gerenteMcDonals.setSegundoApellido("López");
		restauranteMcDonals.setGerente(gerenteMcDonals);


		//:::::::: SEGUNDO RESTAURANTE ::::::::::::::		
		restauranteLaVidArgentina.setNombre("La Vid Argentina");
		restauranteLaVidArgentina.setDireccion("Direccion2");
		restauranteLaVidArgentina.setPais("Argentina");

		Gerente gerenteLaVidArgentina = new Gerente();
		gerenteLaVidArgentina.setNombre("Erick");
		gerenteLaVidArgentina.setPrimerApellido("Guerrero");
		gerenteLaVidArgentina.setSegundoApellido("Gómez");
		restauranteLaVidArgentina.setGerente(gerenteLaVidArgentina);
		
		
		//:::::::: TERCERO RESTAURANTE ::::::::::::::		
		restauranteLaChilaca.setNombre("La Chilaca");
		restauranteLaChilaca.setDireccion("Direccion3");
		restauranteLaChilaca.setPais("Chile");
		
		Gerente gerenteLaChilaca = new Gerente();
		gerenteLaChilaca.setNombre("Luis Jesus");
		gerenteLaChilaca.setPrimerApellido("López");
		gerenteLaChilaca.setSegundoApellido("Romero");
		restauranteLaChilaca.setGerente(gerenteLaChilaca);
		

		//:::::::: CUARTO RESTAURANTE ::::::::::::::
		restauranteCienaga.setNombre("La Cienega");
		restauranteCienaga.setDireccion("Direccion4");
		restauranteCienaga.setPais("Colombia");

		Gerente gerenteCienaga = new Gerente();
		gerenteCienaga.setNombre("Emilio");
		gerenteCienaga.setPrimerApellido("Castillo");
		gerenteCienaga.setSegundoApellido("Merino");
		restauranteCienaga.setGerente(gerenteCienaga);

		//:::::::: QUINTO RESTAURANTE ::::::::::::::
		restauranteSocarrat.setNombre("Socarrat");
		restauranteSocarrat.setDireccion("Direccion5");
		restauranteSocarrat.setPais("España");
		
		Gerente gerenteSocarrat = new Gerente();
		gerenteSocarrat.setNombre("Nixon");
		gerenteSocarrat.setPrimerApellido("Castillo");
		gerenteSocarrat.setSegundoApellido("Jiménez");
		restauranteSocarrat.setGerente(gerenteSocarrat);
		
		restaurantes.add(restauranteMcDonals);
		restaurantes.add(restauranteLaVidArgentina);
		restaurantes.add(restauranteLaChilaca);
		restaurantes.add(restauranteCienaga);
		restaurantes.add(restauranteSocarrat);
		
		return restaurantes;
	}

}
