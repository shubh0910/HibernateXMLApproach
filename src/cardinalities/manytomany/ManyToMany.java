package cardinalities.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
	/*	Student s1=new Student();
		s1.setSname("shubh");
		Student s2=new Student();
		s2.setSname("dev");
		Student s3=new Student();
		s3.setSname("Marmik");
		
		Course c1=new Course();
		c1.setCname("ME");
		Course c2=new Course();
		c2.setCname("CE");
		Course c3=new Course();
		c3.setCname("IT");
	
		Set<Course> sc1=new HashSet<Course>();
		sc1.add(c1);
		sc1.add(c2);
		Set<Course> sc2=new HashSet<Course>();
		sc2.add(c2);
		sc2.add(c3);
		Set<Course> sc3=new HashSet<Course>();
		sc3.add(c1);
		sc3.add(c3);
		
		s1.setCourses(sc1);
		s2.setCourses(sc2);
		s3.setCourses(sc3);
		
		s.save(c3);
		s.save(c2);
		s.save(c1);
		s.save(s1);
		s.save(s2);
		s.save(s3);	
		*/
		Student sans=s.get(Student.class,1);
		System.out.println(sans);
		Course cans=s.get(Course.class, 1);
		System.out.println(cans);
		s.getTransaction().commit();
		s.close();
	}

}
