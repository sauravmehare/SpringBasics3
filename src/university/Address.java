package university;

public class Address {
	
	private String residental;
	private String pin;
	
	public Address() {
		
	}
	public String getResidental() {
		return residental;
	}
	public void setResidental(String residental) {
		this.residental = residental;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Address(String residental, String pin) {
		super();
		this.residental = residental;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [residental=" + residental + ", pin=" + pin + "]";
	}
	
	

}
