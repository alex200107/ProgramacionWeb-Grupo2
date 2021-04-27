package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.JaleCenterC;
import pe.edu.upc.entity.JaleConductor;

public interface IJaleConService {
	public void Insert(JaleConductor jale);

	public List<JaleConductor> list();

	public void Delete(JaleCenterC jaleCenterC);
}
