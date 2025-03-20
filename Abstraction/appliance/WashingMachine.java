package appliance;

public class WashingMachine extends Appliance {

	public WashingMachine(String brand, int powerConsumption) {
		super(brand, powerConsumption);
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		display();
		System.out.println("Clean the cloths");
	}
	

}
