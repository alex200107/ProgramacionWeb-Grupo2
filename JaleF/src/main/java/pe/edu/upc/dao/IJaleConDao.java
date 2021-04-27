package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.JaleConductor;


public interface IJaleConDao {

	public void Insert(JaleConductor conductor);

	public List<JaleConductor> list();

	public void Delete(int dniUser);
	
	
}
