package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "C:\\Users\\Mauricio\\Documents\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}