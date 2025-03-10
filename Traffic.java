class Traffic{
	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		switch(ch){

		case 'R':
			System.out.println("Stop");
			break;
		case 'Y':
			System.out.println("Wait");
			break;
		case 'G':
			System.out.println("Go");
			break;
		default:
			System.out.println("enter valid light!");
			break;
		}
	}
}