package esac.scrumcourse;

public class ProductCherry extends Product {
	
	static int applyDiscountEach = 2;

	public ProductCherry() {
		
		super("Cherries", 75);
		setDiscount(20);
		setApplyDiscountEach(applyDiscountEach);
	}
}
