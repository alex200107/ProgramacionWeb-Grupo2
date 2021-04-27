package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IJaleConDao;
import pe.edu.upc.entity.JaleConductor;

public class JaleConDaoimpl implements IJaleConDao{

	@PersistenceContext(unitName="JaleF")
	private EntityManager em;
	
	
	@SuppressWarnings({ "Unchecked", "unchecked" })
	@Override
	public List<JaleConductor> list() {
		
		List<JaleConductor>lista=new ArrayList<JaleConductor>();
		try {
			Query q = em.createQuery("From JaleConductor m");
			lista=(List<JaleConductor>)q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar conductor");
			System.out.println(e.getLocalizedMessage());
		}
		return lista;
	}
	
	
	@Transactional
	@Override
	public void Insert(JaleConductor conductor) {
		try {
			em.persist(conductor);
		} catch (Exception e) {
			System.out.println("Error al insertar conductor");
		}
		
	}

	
	@Transactional
	@Override
	public void Delete(int dniUser) {

		JaleConductor conductor=new JaleConductor();
		try {
			conductor=em.getReference(JaleConductor.class, dniUser);
			em.remove(conductor);
		} catch (Exception e) {
			System.out.println("Error al elimiar conductor");
		}
		
	}

}
