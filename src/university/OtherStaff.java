package university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OtherStaff implements Staff {
	
	private String empId;
	private Address address;
	@Autowired
	private Insurance insurance;

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println(empId + "Is doing other work");

	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(empId + "other staff doing some work");

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "OtherStaff [empId=" + empId + ", address=" + address + ", insurance=" + insurance + "]";
	}
	

}
