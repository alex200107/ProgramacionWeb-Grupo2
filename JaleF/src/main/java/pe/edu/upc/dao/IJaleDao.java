package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.JaleCenterC;



public interface IJaleDao {

	
	public void Insert(JaleCenterC jale);

	public List<JaleCenterC> list();

	public void Delete(int dniUser);
}
