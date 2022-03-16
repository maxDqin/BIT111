package week02;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tempCelsius;
		double tempFahr;
		double CELSIUS_TO_FAHR = 9.0/5.0;
		double FAHR_OFFSET = 32;
		tempCelsius = 22;
		tempFahr = tempCelsius * CELSIUS_TO_FAHR + FAHR_OFFSET;
		System.out.println(tempCelsius + " celsius is " + tempFahr + " Fahrenheit.");
	}

}
