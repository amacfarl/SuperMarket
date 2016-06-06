package esac.scrumcourse;

import java.io.IOException;

public class Supermarket {

	private static final String END_PROGRAM = "end";
	
	static RegisterMachine registerMachine;

	public static void main(String[] args) {
		Supermarket instance = new Supermarket();

		registerMachine = new RegisterMachine();
		instance.run();
	}

	public void run() {
		try {
			while (true) {
				String productInput = InputHandler.read();
				if(productInput.equalsIgnoreCase(END_PROGRAM)) {
					break;
				}
				String currentTotalOutput = registerMachine.addProduct(productInput);

				OutputHandler.write(currentTotalOutput);
			}
		} catch (IOException e) {

			OutputHandler.write("There was an error with your input. The RegisterMachine will now end.");
		}

	}

}
