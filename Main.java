package burger_App;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger hamburger = new Hamburger("Toasted","beef",5.89,"Macburger");
		hamburger.calculatePrice();
		hamburger.addItem1("tomato", 1.10);
		hamburger.addItem3("lettuce",1.22);
		
		System.out.println("Total price for your order is "+hamburger.calculatePrice());
		
        healthy_Burger healthy = new healthy_Burger("Beacon",7.78);
        healthy.addHealthyItem1("sausage", 3.99);
        System.out.println("Total price for healthy burger is :"+healthy.calculatePrice());
        
        deluxBurger dulux = new deluxBurger();
        System.out.println("Your total is "+dulux.calculatePrice());
        dulux.addItem1("Tomato",1.10);
	}

}
