package esac.scrumcourse;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {

	public InputHandler() {
		// TODO Auto-generated constructor stub
	}

	public static String read() throws IOException {
		
		StringBuffer sBuffer = new StringBuffer();
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		
		int i;
		while((i = inputStreamReader.read() )!= -1) {
			sBuffer.append((char)i);
		}
		
		return sBuffer.toString();
	}
	
	

}
