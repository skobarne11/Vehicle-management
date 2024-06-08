package p4;

import java.util.Scanner;

public class TestVehicle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1St Vehicle details : regsNo Color Price");
		Object v1 = new vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), null);
		System.out.println("Enter The 2St Vehicle details : regsNo Color Price");
		Object v2 = new vehicle(sc.nextInt(), sc.next(), sc.nextDouble(), null);
		System.out.println(v1.equals(v2) ? "SAME" : "DIFFERENT");
		sc.close();
	}

}
 