package multithreading;

public class CurrentThread {
	public static void main(String[] args) {
		CurrentThreadBuss g=new CurrentThreadBuss("GoodMorng");
		g.setPriority(7);
		g.setName("T1");
		g.start();
		CurrentThreadBuss g2=new CurrentThreadBuss("Wellcome");
	    g2.setPriority(10);
	    g2.setName("T2");
	    g2.start();
	    }

	}
