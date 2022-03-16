package burger_App;

public class Hamburger {
	
	private String bread;
	private String meat;
	private double price;
	private String name;
	
	private String item1;
	private double item1Price;
	
	private String item2;
	private double item2Price;
	
	private String item3;
	private double item3Price;
	
	private String item4;
	private double item4Price;
	
	public Hamburger(String bread, String meat, double price, String name) {	
		this.bread = bread;
		this.meat = meat;
		this.price = price;
		this.name = name;
	}
	
	public void addItem1(String tomato,double price) {
		this.item1 = tomato;
		this.item1Price = price;
	}
	
	public void addItem2(String onion,double price) {
		this.item2 = onion;
		this.item2Price = price;
	}
	
	public void addItem3(String lettuce,double price) {
		this.item3 = lettuce;
		this.item3Price = price;
	}
	
	public void addItem4(String cheese,double price) {
		this.item4 = cheese;
		this.item4Price = price;
	}
	
	
	public double calculatePrice() {
		
		double basePrice = this.price;
		System.out.println(this.name+" Hamburger price with "+this.bread
				+ " bread and "+this.meat+" is : "+this.price);
		
		if(this.item1 != null) {
			basePrice+=this.item1Price;
			System.out.println(this.item1+" added to order for "+this.item1Price
					+" $.");
		}if(this.item2 != null) {
			basePrice+=this.item2Price;
			System.out.println(this.item2+" added to order for "+this.item2Price
					+" $.");
		}if(this.item3 != null) {
			basePrice+=this.item3Price;
			System.out.println(this.item3+" added to order for "+this.item3Price
					+" $.");
		}if(this.item4!= null) {
			basePrice+=this.item4Price;
			System.out.println(this.item4+" added to order for "+this.item4Price
					+" $.");
		}
		
		return basePrice;
	}
	
}
