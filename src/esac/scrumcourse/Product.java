package esac.scrumcourse;

public abstract class Product {

	private String name;
	private int cost;
	private int discount;
	private int applyDiscountEach;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Product(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public int applyDiscount(int count){
	  
		if(getApplyDiscountEach() != 0 && 
		        (count % getApplyDiscountEach()) == 0){
			return getDiscount();
		}
		
		return 0;
	}

	public final int getDiscount() {
		return discount;
	}

	public final void setDiscount(int discount) {
		this.discount = discount;
	}

	public final int getApplyDiscountEach() {
		return applyDiscountEach;
	}

	public final void setApplyDiscountEach(int applyDiscountEach) {
		this.applyDiscountEach = applyDiscountEach;
	}
}
