package License;

import java.io.*;
public class License {
public static void main(String[] args) throws IOException {
	File file = new File("D:\\UNIPE\\license.txt");
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
		bw.write(" ");
		if (file != null) { bw.close(); }
		
	} catch (IOException e) {
		e.printStackTrace();
		 
		
	}
	
}
}
