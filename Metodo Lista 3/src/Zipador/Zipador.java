package Zipador;

import java.io.*;
import java.util.zip.*;

import javax.swing.JOptionPane;

public class Zipador {
	public static void main(String[] args) throws IOException {
		
		try {
			File file = new File("D:\\UNIPE\\relatorio.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Testando o Zipador");
			bw.close();
		    BufferedReader in = new BufferedReader(new FileReader("D:\\UNIPE\\relatorio.txt"));
			BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("D:\\UNIPE\\arquivo.gz"))); 
		    int content;
		    while ((content = in.read()) != -1) {
		        out.write(content );
		    }
		    in.close();
		    out.close();
		    BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("D:\\UNIPE\\arquivo.gz"))));
		    String string;
		    while ((string = in2.readLine()) != null) {
		    	JOptionPane.showMessageDialog(null, string);
		    }  
		    in2.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
}
