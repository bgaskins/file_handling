package com.filehandler;


import java.io.File;
import java.util.Scanner;


public class FileRead {
	
	private Scanner sc;
	//Scanner searches and opens file.
	public void openFile() {
		try {
			sc = new Scanner(new File("ProjectTextFile.txt"));
		}
		catch(Exception e){
			System.out.println("File not found. :( ");
		}
	}
	//Reads the file line by line and prints the string from the file.
	public void readFile() {
		while(sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
	}
	//Closes file.
	public void closeFile() {
		sc.close();
	}


}
