package burger_App;

public class healthy_Burger extends Hamburger{
	
	private String Item1;
	private String Item2;
	private double item1Price;
	private double item2Price;
	
	public healthy_Burger(String meat, double price) {
		super("Wholewheate", meat, price,"Healthy");
	}
	
	public void addHealthyItem1(String item,double price) {
		this.Item1 = item;
		this.item1Price = price;
	}
	
	public void addHealthyItem2(String item,double price) {
		this.Item2 = item;
		this.item2Price = price;
	}

	@Override
	public double calculatePrice() {
		
		double hprice = super.calculatePrice();
		
		if(this.Item1 != null) {
			hprice += this.item1Price;
			System.out.println(this.Item1+" added to order for "+this.item1Price);
			
		}if(this.Item2 != null) {
			hprice+=this.item2Price;
			System.out.println(this.Item2+" added to order for "+this.item2Price);
		}
		return hprice;
	}
	
	
	
	

}
