package esac.scrumcourse;

public class Product {

	private String name;
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

	private int cost;
	
	public Product(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

}
