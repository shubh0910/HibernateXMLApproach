package cardinalities.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class One2Many {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
	/*
	//	Employee e=new Employee();
	//	e.setEname("shubh");
		Employee e1=new Employee();
		e1.setEname("dev");
		
		Set<Employee> emp=new HashSet<Employee>();
		emp.add(e1);
	//	emp.add(e);
		Department d=new Department();
		d.setDname("ME");
		d.setEmp(emp);
		s.save(d);
	//	s.save(e);
		s.save(e1);
		*/
		Employee e=s.get(Employee.class,1);
		System.out.print(e);
		Department d=s.get(Department.class,1);
		System.out.print(d);
		s.getTransaction().commit();
		s.close();
	}

}
