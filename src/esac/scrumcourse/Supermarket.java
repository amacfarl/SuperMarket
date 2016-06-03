package esac.scrumcourse;

import java.io.IOException;

public class Supermarket {
	
	static RegisterMachine registerMachine;
	
	public static void main(String[] args) {
		Supermarket instance = new Supermarket();
		
		registerMachine = new RegisterMachine();
		instance.run();
	}
	
	public void run() {
		try {
			String input = InputHandler.read();
			String output = registerMachine.addProduct(input);
			
			OutputHandler.write(output);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
