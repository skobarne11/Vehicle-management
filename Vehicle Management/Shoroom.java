package p4;

import java.util.Scanner;

import static p4.ValidationRules.checkForDup;

public class Shoroom {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			vehicle[] vehicles = new vehicle[100];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Options 1.Add Vehicle 2.Display 3.Exit");
				switch (sc.nextInt()) {
				case 1:
					if (counter < vehicles.length) {
						System.out.println("Enter vehicle details : regsNo clor price Type");
						//int regNo = sc.nextInt();
					//	String clor = sc.next();
					//	double price = sc.nextDouble();
					//	checkForDup(vehicles, sc.nextInt(), sc.next(), sc.nextDouble());
					//	vehicles[counter++] = new vehicle(regNo, clor, price);
						vehicle v = checkForDup(vehicles,sc.nextInt(),sc.next(),sc.nextDouble(),sc.next());
						vehicles[counter++]=v;
						System.out.println("vehicles Details Added");
					} else {
						throw new VehicleHandlingException("Shoroom is fulll");
					}
					break;
				case 2:
					System.out.println("shoroom details");
					for (vehicle v : vehicles) {
						if (v != null)
							System.out.println(v);
					}
					break;
				case 3:
					exit = true;
					break;

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
