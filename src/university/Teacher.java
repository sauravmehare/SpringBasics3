package university;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher implements Staff {
	
	private String empId;
	private Address address;
	
	@Autowired
	private Insurance Insurance;
	
	public Teacher(String empId) {
		this.empId = empId;
		//this.address = address;
	}
	
	public Teacher() {
		
	}


	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println(empId + "Is teaching.");

	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(empId + "teacher is getting salary.");

	}


	@Override
	public String toString() {
		return "Teacher [empId=" + empId + ", address=" + address + ", Insurance=" + Insurance + "]";
	}
	

}
