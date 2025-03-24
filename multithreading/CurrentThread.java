package multithreading;

public class CurrentThread {
	public static void main(String[] args) {
		GoodMorning g=new GoodMorning("GoodMorng");
		g.setPriority(7);
		g.setName("T1");
		g.start();
	GoodMorning g2=new GoodMorning("Wellcome");
	    g2.setPriority(10);
	    g2.setName("T2");
	    g2.start();
	    }

	}
