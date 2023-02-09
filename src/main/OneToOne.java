package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.SessionFactoryUtil;
import modelo.ContactInfo;
import java.util.List;

public class OneToOne {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		List<ContactInfo> infos = 
				session.createQuery("SELECT p.contactInfos from Profesor p where p.id = :id")
				//session.createQuery("SELECT c from ContactInfo c where c.profesor.id = :id")
				.setParameter("id", 1).list();
		
		for (ContactInfo contactInfo : infos) {
			System.out.println("contact info: " + contactInfo + " profesor: " + contactInfo.getProfesor());
		}

	}

}
