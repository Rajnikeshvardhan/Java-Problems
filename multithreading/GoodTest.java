package multithreading;

public class GoodTest {
	public static void main(String[] args) throws InterruptedException {
		GoodMorning g=new GoodMorning("GoodMorng");
		g.start();
	GoodMorning g2=new GoodMorning("Wellcome");
	    g2.start();
	    }

}
