public class Car extends Vehicle {
	

	// constructeurs super

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		
	}

	// implementation de la methode doStuff

	public String doStuff() {
		return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
	}
	

}
