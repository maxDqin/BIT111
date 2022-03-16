package week03;

public class Ex2 {
	public static void main(String args[]) {
		double baseCost = 1.85; // base cost used in formula to calculate cost
		double weightFeeNational = 3.50; // weight fee per kg for national delivery
		double weightFeeInter = 5.50; // weight fee per kg for international delivery is $2 more than the national fee

		// variables you can change to test the code
		String Delivery = "national"; // determine "national" or "international" delivery
		double weight = 3.5; // parcel weight
		double size = 0.5; // parcel size

		double cost = -1; // shipping cost

		if ((size <= 1) && (weight <= 23)) { // No parcel can be larger than 1 m3 or weigh more than 23 kg
			// calculate cost for National delivery
			if (Delivery.equals("national")) {
				cost = baseCost + weight * weightFeeNational;
			} else if (Delivery == "international") { // calculate cost for International delivery
				cost = baseCost + weight * weightFeeInter;
				if (size > 0.125) {
					cost += 7.50; // 7.50 is extra cost for large international parcels greater than 0.125m3
				}
			} else { // the case when "national" or "international" is mistyped
				System.out.println("Delivery type should be either \"national\" or \"international\"");
			}

			if (cost != -1) {
				System.out.println("The shipping cost is " + cost);
			}
		} else { // parcel does not meet requirements
			System.out.println("Shipment is refused because it is overweighted or oversized.");
		}

	}
}
