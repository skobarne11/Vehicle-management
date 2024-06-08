package p4; 
import p4.VehicleType;


public class ValidationRules {
	public static vehicle checkForDup(vehicle[] vehicleData, int regsNo, String color,double price,String VehicleType) throws VehicleHandlingException {

		vehicle newVehicle = new vehicle(regsNo, color);
		for (vehicle v : vehicleData) {
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Duplicate Vehicle Detected");
				else
					System.out.println("Vehicles Are different");
			
		}
		return newVehicle;
	}

}

