package appliance;

public abstract class Appliance {
	String brand;
	int powerConsumption;
	
	public Appliance(String brand, int powerConsumption) {
		super();
		this.brand = brand;
		this.powerConsumption = powerConsumption;
	}

	abstract void turnOn();
	public void display() {
		System.out.println(brand+""+powerConsumption);
	}

}
