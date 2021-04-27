package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IJaleDao;
import pe.edu.upc.entity.JaleCenterC;
import pe.edu.upc.service.IJaleService;



@Named
public class JaleServiceimpl implements IJaleService{

	@Inject
	private IJaleDao jaDao;



	public List<JaleCenterC> list() {

		return jaDao.list();
	}


	@Override
	public void Insert(JaleCenterC jale) {
		// TODO Auto-generated method stub
		jaDao.Insert(jale);
	}

	@Override
	public void Delete(int dniUser) {
		// TODO Auto-generated method stub
		jaDao.Delete(dniUser);
		
	}

}
