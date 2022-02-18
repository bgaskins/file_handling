package com.filehandler;

import java.io.File;
import java.io.IOException;

public class FileHandlerMain {

	public static void main(String[] args) throws IOException {
	      
			//Adding FileRead and FileAppend objects to connect classes to main.
			FileAppend file = new FileAppend();
			FileRead read = new FileRead();
			
			//Program creates ProjectTextFile.txt file and writes to new text file.
			//Program appends file, using file.append to add new text to file.
			try {
				File f = new File("ProjectTextFile.txt");
				file.write("Here is written text for the project file.\n", f);
				file.append("We needed to add a few more details, so here they are.\n", f);
			
			//Program reads from FileRead class to find/open file (with exception), read what's
			//in the opened file, and then closes the file.
				read.openFile();
				read.readFile();
				read.closeFile();
			}
			
			//If program fails to execute successfully, an IOException occurs. 
			catch(IOException e) {
				
			}
			
		 }

	}
	

