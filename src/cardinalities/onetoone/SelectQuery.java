package cardinalities.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

public class SelectQuery {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	//	ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build(); 
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		/*
		Employee e=new Employee();
		e.setEname("dev");
		e.setEsalary(2000000);
		
		Address a=new Address();
		a.setEcity("Surat");
		a.setEstate("gujarat");
		
		e.setAddress(a);
		a.setEmp(e);
		s.save(a);
		s.save(e);
		*/
		Employee e1=new Employee();
		e1=s.get(Employee.class, 3);
		System.out.println(e1);
		s.getTransaction().commit();
		s.close();
		
	}

}
