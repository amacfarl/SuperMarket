package esac.scrumcourse;

import java.util.ArrayList;
import java.util.List;

public class RegisterMachine {

	List<Product> productsInStock;

	public RegisterMachine() {
		productsInStock = new ArrayList<Product>();
		productsInStock.add(new ProductApple());
		productsInStock.add(new ProductBanana());
		productsInStock.add(new ProductCherry());
	}

	public String executeStep(String inputStr) {
		for(Product product : productsInStock) {
			if(product.getName().equalsIgnoreCase(inputStr)) {
				return Integer.toString(product.getCost());
			}
		}
		
		throw new IllegalArgumentException("Unrecognised product");
	}
}
 