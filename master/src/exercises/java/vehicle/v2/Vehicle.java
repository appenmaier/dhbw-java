package exercises.java.vehicle.v2;

/**
 * Fahrzeug
 * 
 * @author Daniel Appenmaier
 * @version 2.0
 */
public class Vehicle {

	/*
	 * Attribute
	 */
	/**
	 * Hersteller
	 */
	private String make;

	/**
	 * Modell
	 */
	private String model;

	/**
	 * Geschwindigkeit
	 */
	private double speed;

	/*
	 * Konstruktoren
	 */
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}

	/*
	 * Setter und Getter
	 */
	// public void setMake(String make) {
	// this.make = make;
	// }

	// public void setModel(String model) {
	// this.model = model;
	// }

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	/*
	 * Methoden
	 */
	public void accelerate(int value) {
		speed += value;
		System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
	}

	public void brake(int value) {
		speed -= value;
		System.out.println(make + " " + model + " bremst auf " + speed + "km/h ab");
	}

	public void print() {
		System.out.println(make + " " + model);
	}

}
