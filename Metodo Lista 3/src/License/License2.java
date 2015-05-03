package License;

import java.io.*;
public class License2 {
public static void main(String[] args) throws IOException {
	
	FileOutputStream os = new FileOutputStream("D:\\UNIPE\\licenca.txt");
     OutputStreamWriter osw = new OutputStreamWriter(os);
     BufferedWriter bw = new BufferedWriter(osw);
 
     try {
     bw.write("LICN889930");
     
   
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		if (osw != null) bw.close();
	}
	
}
}
