package cardinalities.onetoone;

public class Employee {
private int eid;
private String ename;
private int esalary;
private Address address;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary
			+ ", address=" + address + "]";
}

}
