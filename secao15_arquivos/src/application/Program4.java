package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho da pasta: ");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);		
		
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		for(File file: files) {
			System.out.println(file);
		}
		
		boolean success = new File(folderPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: " + success);
		
		sc.close();
	}
}