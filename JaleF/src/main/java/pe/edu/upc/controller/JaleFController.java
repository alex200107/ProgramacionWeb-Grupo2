package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.JaleCenterC;
import pe.edu.upc.service.IJaleService;

@Named
@RequestScoped
public class JaleFController {
	
	@Inject
	private IJaleService jaService;
	
	private JaleCenterC jale;
	List<JaleCenterC> listaUsers;
	@PostConstruct
	
	public void init() {
		this.listaUsers = new ArrayList<JaleCenterC>();
		this.jale = new JaleCenterC();
		this.listar();
	}
	
	
	
	public String nuevoJaleApp() {
		this.setJalec(new JaleCenterC());
		return "jaleApp.xhtml";

	}

	public void insert() {
		try {
			jaService.Insert(jale);			
	
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de usuario center");
		}
	}
	
	
	public void listar() {
		try {
			listaUsers=jaService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de usuario center");
		}
	}

	public void eliminar(JaleCenterC medic) {
		try {
			jaService.Delete(medic.getDniUser());
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de usuario center");
		}
	}
	
	
	
	// get y set
	public JaleCenterC getJale() {
		return jale;
	}

	public void setJalec(JaleCenterC jale) {
		this.jale = jale;
	}

	public List<JaleCenterC> getListaUsers() {
		return listaUsers;
	}

	public void setListaUsers(List<JaleCenterC> listaCentrosMedicos) {
		this.listaUsers = listaCentrosMedicos;
	}

}
