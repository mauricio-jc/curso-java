package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\Mauricio\\Documents\\in.txt";
		Map<String, Integer> list = new HashMap<String, Integer>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				if(list.containsKey(fields[0])) {
					int votes = list.get(fields[0]);
					votes = votes + Integer.parseInt(fields[1]);
					list.put(fields[0], votes);
				}
				else {
					list.put(fields[0], Integer.parseInt(fields[1]));
				}
				
				line = br.readLine();
			}
			
			for(String item: list.keySet()) {
				System.out.println(item + ": " + list.get(item));
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}