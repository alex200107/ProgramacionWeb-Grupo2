package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IJaleConDao;
import pe.edu.upc.entity.JaleCenterC;
import pe.edu.upc.entity.JaleConductor;
import pe.edu.upc.service.IJaleConService;

@Named
@RequestScoped
public class JaleCondServiceimpl implements IJaleConService{
	@Inject 
	private IJaleConDao jao;
	
	
	@Override
	public void Insert(JaleConductor jale) {
		jao.Insert(jale);
		
	}

	@Override
	public List<JaleConductor> list() {
		
		return jao.list();
	}

	@Override
	public void Delete(JaleCenterC dniUser) {
		jao.Delete(dniUser.getDniUser());
		
	}

}
