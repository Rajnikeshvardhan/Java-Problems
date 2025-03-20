package appliance;

public class Microwave extends Appliance {

	public Microwave(String brand, int powerConsumption) {
		super(brand, powerConsumption);
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		display();
		System.out.println("heats dishes");
	}
	

}
