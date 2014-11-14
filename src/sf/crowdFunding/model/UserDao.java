package sf.crowdFunding.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class UserDao{
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CrowdFunding");
	EntityManager em = null;

	public UserDao(){
		em = factory.createEntityManager();
	}

	public void createUser(User user){
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}
	
	public User findUserByUsername(String username){
		em.getTransaction().begin();
		try{
			Query q = em.createNamedQuery("User.findByUsername");
			q.setParameter("username", username);
			User user = (User) q.getSingleResult();
			em.getTransaction().commit();
			em.close();
			return user;
		}catch(NoResultException e){
			return null;
		}
	}
	
//	public static void main(String[] args) {
//		
//		//UserDao dao = new UserDao();
////		User leo = dao.findUserByUsername("leohihimax");
////		System.out.println(leo);
////		User ma = new User("leomax","Jiajun","Ma","ma.j@husky.neu.edu", 1000, "leomax");
////		User leo = new User("leohihimax","Jiajun","Ma","leohihimax@gmail.com",5000,"leohihimax");
////		dao.createUser(ma);
////		dao.createUser(leo);
////		User rachel = new User("rachel","Yuqiu","Lei","Yuqiu@gmail.com",500,"rachel");
////		dao.createUser(rachel);
//	}

}
