package com.filehandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	//Writes to the text file.
	public void write(String str, File f) throws IOException {

		FileWriter fw = new FileWriter(f);
		fw.write(str);
		fw.close();
	}
	
	//Appends (adds) to the text file.
	public void append(String str, File f) throws IOException {

		FileWriter fw = new FileWriter(f, true);
		fw.write(str);
		fw.close();

     
	}

}
