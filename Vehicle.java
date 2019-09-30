public abstract class Vehicle {


	// attributs

	private String brand;
	private int kilometers;

	// constructeurs

	public Vehicle(String brand, int kilometers){
		this.brand = brand;
		this.kilometers = kilometers;
	}

	// getter setter

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return this.kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	// methode abstaite doStuff

	public abstract String doStuff();





}
