package esac.scrumcourse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegisterMachineTest {

	RegisterMachine registerMachine;
	
	@Before
	public void stepUp() {
		registerMachine = new RegisterMachine();
	}

	@Test
	public void whenInputIsApplesReturnsCost() {
		String inputStr = "Apples";
		assertEquals("100", registerMachine.addProduct(inputStr));
	}
	
	@Test
	public void whenInputIsBananasReturnsCost() {
		String inputStr = "Bananas";
		assertEquals("150", registerMachine.addProduct(inputStr));
	}
	
	@Test
	public void whenInputIsCherriesReturnsCost() {
		String inputStr = "Cherries";
		assertEquals("75", registerMachine.addProduct(inputStr));
	}
	
	@Test
	public void whenInputIsTwoApplesReturnsCostOfTwoApples() {
		String inputStr = "Apples";
		assertEquals("100", registerMachine.addProduct(inputStr));
		assertEquals("200", registerMachine.addProduct(inputStr));
	}
	
	@Test
	public void whenInputIsThreeBananasReturnsCostOfThreeBananas() {
		String inputStr = "Bananas";
		assertEquals("150", registerMachine.addProduct(inputStr));
		assertEquals("300", registerMachine.addProduct(inputStr));
		assertEquals("450", registerMachine.addProduct(inputStr));
	}
	
	@Test
	public void whenInputIsTwoCherriesReturnsCostOfTwoCherriess() {
		String inputStr = "Cherries";
		assertEquals("75", registerMachine.addProduct(inputStr));
		assertEquals("150", registerMachine.addProduct(inputStr));
	}
	
	@Test
	public void whenInputIsAppleAndBananaReturnsCostOfThem() {
		
		assertEquals("100", registerMachine.addProduct("Apples"));
		assertEquals("250", registerMachine.addProduct("Bananas"));
	}
	
}
