package esac.scrumcourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterMachine {

    private Map<Product, Integer> productsAdded;
	List<Product> availableProductTypes;
	Integer total;

	public RegisterMachine() {
	    productsAdded = new HashMap<Product, Integer>();
	    
		availableProductTypes = new ArrayList<Product>();
		availableProductTypes.add(new ProductApple());
		availableProductTypes.add(new ProductBanana());
		availableProductTypes.add(new ProductCherry());
		
		// Initialise total
		total = 0;
	}

	public String addProduct(String inputStr) {
	    for(Product product : availableProductTypes) {
            if(product.getName().equalsIgnoreCase(inputStr)) {
                addToTotalProducts(product);
                
                total += product.getCost();
                total -= product.applyDiscount(productsAdded.get(product));
            }
        }
	    
        return Integer.toString(total);
	}
	
	public void addToTotalProducts(Product product) {
	    
	    if(productsAdded.containsKey(product)) {
	        productsAdded.put(product, productsAdded.get(product) + 1);
        } else {
            productsAdded.put(product, 1);
        }
	    

	}
}
 