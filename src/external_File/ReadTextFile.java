package external_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		String path = "data\\abc.csv";
		
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//br.readLine();
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		String line ;
		while( ( line =br.readLine()) != null) {
			System.out.println(line);
		}

	}

}
