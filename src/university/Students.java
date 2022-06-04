package university;

public class Students {
private String stuId;
private String name;
private int standard;
private Address address;
public Students(String stuId, String name, int standard, Address address) {
	super();
	this.stuId = stuId;
	this.name = name;
	this.standard = standard;
	this.address = address;
}
public String getStuId() {
	return stuId;
}
public void setStuId(String stuId) {
	this.stuId = stuId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Students [stuId=" + stuId + ", name=" + name + ", standard=" + standard + ", address=" + address + "]";
}

}
