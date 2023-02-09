package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.SessionFactoryUtil;
import modelo.ContactInfo;
import modelo.Profesor;

import java.util.List;
import java.util.Set;

public class OneToOne {
	public static void main(String[] args) {

		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		 //addMoreThanOneContactInfoToProfesor(session, 1);

		addMoreThanOneContactInfoToProfesorFromContactInfo(session, 1);

		session.close();
		sessionFactory.close();

	}

	private static void addMoreThanOneContactInfoToProfesor(Session session, int profeId) {
		Transaction tx = null;

		Profesor profe = (Profesor) session.createQuery("SELECT p FROM Profesor p where p.id = :id")
				.setParameter("id", profeId).uniqueResult();

		Set<ContactInfo> info = profe.getContactInfos();
		for (ContactInfo contactInfo : info) {
			System.out.println("Profe: " + profe.getId() + " Contact info: " + contactInfo);
		}

		ContactInfo cInfoNueva = new ContactInfo();
		cInfoNueva.setEmail("algo@algo.com");
		cInfoNueva.setTlfMovil("666 123 123");

		// Relación bidireccional
		profe.addContactInfo(cInfoNueva);

		try {
			session.saveOrUpdate(cInfoNueva);
			session.saveOrUpdate(profe);

			tx.commit();
		} catch (Exception ex) {
			System.out.println("Ha ocurrido una excepción: " + ex.getMessage());
			if (tx != null) {
				tx.rollback();
			}
		}
	}

	private static void addMoreThanOneContactInfoToProfesorFromContactInfo(Session session, int profeId) {
		List<ContactInfo> infos =
				// session.createQuery("SELECT p.contactInfos from Profesor p where p.id = :id")
				session.createQuery("SELECT c from ContactInfo c where c.profesor.id = :id").setParameter("id", profeId)
						.list();

		ContactInfo cInfoNueva = new ContactInfo();
		cInfoNueva.setEmail("algo2@algo.com");
		cInfoNueva.setTlfMovil("666 123 123");
		Transaction tx = null;
		try {
			for (ContactInfo contactInfo : infos) {
				System.out.println("contact info: " + contactInfo + " profesor: " + contactInfo.getProfesor());
				Profesor profe = contactInfo.getProfesor();

				// Relación bidireccional
				profe.addContactInfo(cInfoNueva);

				tx = session.beginTransaction();
				session.saveOrUpdate(cInfoNueva);
				session.saveOrUpdate(profe);

			}
			tx.commit();
		} catch (Exception ex) {
			System.out.println("Ha ocurrido una excepción: " + ex.getMessage());
			if (tx != null) {
				tx.rollback();
			}
		}

	}

}
