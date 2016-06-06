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
			while (true) {
				String productInput = InputHandler.read();
				String currentTotalOutput = registerMachine.addProduct(productInput);

				OutputHandler.write(currentTotalOutput);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
