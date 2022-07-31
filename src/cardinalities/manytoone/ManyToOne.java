package cardinalities.manytoone;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToOne {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		/*
		Department d=new Department();
		d.setDname("ME");
		
		Employee e=new Employee();
		e.setEname("shubh");
		e.setDepartment(d);
		Employee e1=new Employee();
		e1.setEname("dev");
		e1.setDepartment(d);
		s.save(d);
		s.save(e1);
		s.save(e);
		*/
		Employee e2=s.get(Employee.class,2);
		System.out.println(e2);
		Department d2=s.get(Department.class,1);
		System.out.println(d2);
		s.getTransaction().commit();
		s.close();
	}

}
