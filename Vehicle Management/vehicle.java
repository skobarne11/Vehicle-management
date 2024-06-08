package p4;
import java.text.SimpleDateFormat;
import java.util.Date;




public class vehicle {

	public vehicle(int registrationNo, String color) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
	}

	private int registrationNo;

	private String color;

	private double price;
	
	
	private VehicleType type;
	
	

	public vehicle(int registrationNo, String color, double price,VehicleType type) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
		this.type=type;
	}
@Override 
	public String toString() {
		return "vehicle[ registrationNo=" + registrationNo + ",color=" + color + ",price=" + price +"Vehicle Type"+type +"]";
	}

	public boolean equals(Object anotherObject) {
		System.out.println("In vehicle equals");
		if (anotherObject instanceof vehicle) {
			vehicle v = (vehicle) anotherObject;
			return this.registrationNo == v.registrationNo && color.equals(v.color);

		}
		return false;
	}

}
 