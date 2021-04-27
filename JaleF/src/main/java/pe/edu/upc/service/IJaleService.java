package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.JaleCenterC;


public interface IJaleService {
	public void Insert(JaleCenterC jale);

	public List<JaleCenterC> list();

	public void Delete(int dniUser);

}
