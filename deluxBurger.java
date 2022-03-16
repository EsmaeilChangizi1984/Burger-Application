package burger_App;

public class deluxBurger extends Hamburger{
	
	public deluxBurger() {
		super("White bread", " fillet & fish", 15.90, "Delux ");
		super.addItem1("chips", 1.20);
		super.addItem2("soda",2.33);
	}

	@Override
	public void addItem1(String tomato, double price) {
		System.out.println("Adding more than two item is impossible on dulex.");
	}

	@Override
	public void addItem2(String onion, double price) {
		System.out.println("Adding more than two item is impossible on dulex.");
	}

	@Override
	public void addItem3(String lettuce, double price) {
		System.out.println("Adding more than two item is impossible on dulex.");
	}

	@Override
	public void addItem4(String cheese, double price) {
		System.out.println("Adding more than two item is impossible on dulex.");
	}
	
	

}
