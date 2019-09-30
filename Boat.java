public class Boat extends Vehicle {

	// implementation du corps de la methode doStuff

	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		
	}


	// implementation de la methode doStuff

	public String doStuff() {
		return "Je suis " + this.getBrand() + " et je fais glou glou !";
	}





}
