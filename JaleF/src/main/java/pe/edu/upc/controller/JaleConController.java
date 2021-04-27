package pe.edu.upc.controller;



import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.JaleCenterC;
import pe.edu.upc.entity.JaleConductor;
import pe.edu.upc.service.IJaleConService;
import pe.edu.upc.service.IJaleService;

@Named
@RequestScoped
public class JaleConController {

	@Inject
	private IJaleConService cservice;
	@Inject
	private IJaleService uservice;
	
	private JaleCenterC user;
	private JaleConductor condu;
	
	List<JaleConductor> listacondu;
	List<JaleCenterC> listauser;
	
	public void init() {
		this.user=new JaleCenterC();
		this.condu=new JaleConductor();
		this.listacondu= new ArrayList<JaleConductor>();
		this.listauser= new ArrayList<JaleCenterC>();
	}
	
	
	
	public String nuevoCon() {
		this.setCondu(new JaleConductor());
		return "conductor.xhtml";
	}
	
	public void insertar() {
		try {
			cservice.Insert(condu);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de conductor");
		}
	}
	
	public void listarCon() {
		try {
			listacondu=cservice.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el listar conductor");
		}
	}
	
	public void listaUsuario() {
		
		try {
			listauser=uservice.list();	
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controller conductor");
		}
	}
	
	public void eliminar(JaleConductor cond) {
		try {
			cservice.Delete(cond.getId());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de conductor");
		}
	}
	
	
	/////get - set
	public IJaleConService getCservice() {
		return cservice;
	}

	public void setCservice(IJaleConService cservice) {
		this.cservice = cservice;
	}

	public IJaleService getUservice() {
		return uservice;
	}

	public void setUservice(IJaleService uservice) {
		this.uservice = uservice;
	}

	public JaleCenterC getUser() {
		return user;
	}

	public void setUser(JaleCenterC user) {
		this.user = user;
	}

	public JaleConductor getCondu() {
		return condu;
	}

	public void setCondu(JaleConductor condu) {
		this.condu = condu;
	}

	public List<JaleConductor> getListacondu() {
		return listacondu;
	}

	public void setListacondu(List<JaleConductor> listacondu) {
		this.listacondu = listacondu;
	}
	
	
	
	

	

}
