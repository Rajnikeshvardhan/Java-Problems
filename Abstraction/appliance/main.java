package appliance;

public class main {
	public static void main(String[] args) {
		Appliance WashingMachine = new WashingMachine("LG",10000);
		Appliance Refrigerator = new Refrigerator("LG2",2000);
		Appliance microWave=new Microwave("Lg3",7999);
	
	
	WashingMachine.turnOn();
	Refrigerator.turnOn();
	microWave.turnOn();
	
}
}