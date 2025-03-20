package appliance;

public class Refrigerator extends Appliance {

	public Refrigerator(String brand, int powerConsumption) {
		super(brand, powerConsumption);
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		display();
		// TODO Auto-generated method stub
		System.out.println("cools dishes");
	}
	

}
