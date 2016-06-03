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
		assertEquals("100", registerMachine.executeStep(inputStr));
	}
	
	@Test
	public void whenInputIsBananasReturnsCost() {
		String inputStr = "Bananas";
		assertEquals("150", registerMachine.executeStep(inputStr));
	}
	
	@Test
	public void whenInputIsCherriesReturnsCost() {
		String inputStr = "Cherries";
		assertEquals("75", registerMachine.executeStep(inputStr));
	}
}
