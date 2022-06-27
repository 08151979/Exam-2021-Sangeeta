package external_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DoesWriteFileExist {

	public static void main(String[] args) throws IOException {
		
		String path = "data\\abc.csv";
		
		File f = new File(path);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Word1");
		bw.newLine();
		bw.newLine();
		bw.write(" ");
		bw.write("Meaning1");
		bw.newLine();
		bw.newLine();
		bw.write(" ");
		bw.write("Meaning2");
		bw.newLine();
		bw.newLine();
		bw.write("Word2");
		bw.newLine();
		bw.newLine();
		bw.write(" ");
		bw.write("Meaning1");
		bw.newLine();
		bw.newLine();
		bw.write(" ");
		bw.write("Meaning2");
//		bw.write("class,grade,student");
//		bw.newLine();
//		bw.write("ALM,90,55");
//		bw.newLine();
//		bw.write("CNS,80,65");
		bw.close();
	}

}
