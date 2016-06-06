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
    public void whenInputIsTwoCherriesReturnsCostOfTwoCherries() {
        String inputStr = "Cherries";
        assertEquals("75", registerMachine.addProduct(inputStr));
        assertEquals("130", registerMachine.addProduct(inputStr));

    }

    @Test
    public void whenInputIsAppleAndBananaReturnsCostOfThem() {

        assertEquals("100", registerMachine.addProduct("Apples"));
        assertEquals("250", registerMachine.addProduct("Bananas"));
    }

    @Test
    public void whenInputIsAppleAndCherriesReturnsCostOfThem() {

        assertEquals("100", registerMachine.addProduct("Apples"));
        assertEquals("175", registerMachine.addProduct("Cherries"));
    }
    
    @Test
    public void whenInputIsBananasAndCherriesReturnsCostOfThem() {

        assertEquals("150", registerMachine.addProduct("Bananas"));
        assertEquals("225", registerMachine.addProduct("Cherries"));
    }

    @Test
    public void whenInputIsFourCherriesReturnsCostOfFourCherries() {
        String inputStr = "Cherries";
        assertEquals("75", registerMachine.addProduct(inputStr));
        assertEquals("130", registerMachine.addProduct(inputStr));
        assertEquals("205", registerMachine.addProduct(inputStr));
        assertEquals("260", registerMachine.addProduct(inputStr));

    }
    
    @Test
    public void whenInputIsTwoCherriesAndAppleAndBananaReturnsCostOfThem() {
        assertEquals("75", registerMachine.addProduct("Cherries"));
        assertEquals("225", registerMachine.addProduct("Bananas"));
        assertEquals("280", registerMachine.addProduct("Cherries"));
        assertEquals("380", registerMachine.addProduct("Apples"));

    }

}
