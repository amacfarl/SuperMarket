package esac.scrumcourse;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegisterMachineTest {

	@Test
	public void whenExecuteStepWithStringParamReturnSameString() {
		String inputStr = "inputTest";
		assertEquals(inputStr, RegisterMachine.executeStep(inputStr));
		
	}

}
