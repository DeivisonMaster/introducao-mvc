package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory;
	
	static{
		entityManagerFactory = Persistence.createEntityManagerFactory("unidade");
	}
	
	public EntityManager getEntity(){
		return entityManagerFactory.createEntityManager();
	}
	
}
