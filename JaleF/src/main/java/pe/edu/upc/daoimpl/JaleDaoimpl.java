package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IJaleDao;

import pe.edu.upc.entity.JaleCenterC;

public class JaleDaoimpl implements IJaleDao{

	@PersistenceContext(unitName = "JaleF")
	private EntityManager em;


	@SuppressWarnings("unchecked")
	public List<JaleCenterC> list() {

		List<JaleCenterC> lista = new ArrayList<JaleCenterC>();
		try {

			Query q = em.createQuery("from JaleCenterC m");
			lista = (List<JaleCenterC>) q.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar User");
			System.out.println(e.getLocalizedMessage());
		}

		return lista;
	}

	

	@Transactional
	public void Insert(JaleCenterC jale) {
		try {

			em.persist(jale);

		} catch (Exception e) {
			System.out.println("Error al insertar User");
		}
		
	}

	@Transactional
	public void Delete(int dniUser) {
		JaleCenterC jale = new JaleCenterC();
		try {
			jale = em.getReference(JaleCenterC.class, dniUser);
			em.remove(jale);
		} catch (Exception e) {
			System.out.println("Error al elimiar User");
		}
		
	}
	

}
