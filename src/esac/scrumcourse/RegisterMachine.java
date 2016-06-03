package esac.scrumcourse;

import java.util.ArrayList;
import java.util.List;

public class RegisterMachine {

	List<Product> productsInStock;
	Integer total;

	public RegisterMachine() {
		productsInStock = new ArrayList<Product>();
		productsInStock.add(new ProductApple());
		productsInStock.add(new ProductBanana());
		productsInStock.add(new ProductCherry());
		
		// Initialise total
		total = 0;
	}

	public String addProduct(String inputStr) {
		for(Product product : productsInStock) {
			if(product.getName().equalsIgnoreCase(inputStr)) {
				total += product.getCost();
			}
		}
		
		return Integer.toString(total);
	}
}
 