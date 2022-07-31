package cardinalities.onetomany;

import java.util.Set;

public class Department {
private int did;
private String dname;
private Set<Employee> emp;
@Override
public String toString() {
	return "Department [did=" + did + ", dname=" + dname + ", emp=" + emp + "]";
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Set<Employee> getEmp() {
	return emp;
}
public void setEmp(Set<Employee> emp) {
	this.emp = emp;
}

}
