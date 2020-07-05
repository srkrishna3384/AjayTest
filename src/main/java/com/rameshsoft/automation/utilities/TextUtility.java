package com.rameshsoft.automation.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextUtility {
public static void main(String[] args) throws IOException {
	
	File file = new File("D:\\6AM-ONLINE\\secondapp\\src\\com\\rameshsoft\\automation\\utilities\\RameshsSoft.txt");
	boolean status = file.createNewFile();
	if (status) {
		System.out.println("File is created succesfully");
	}
	else{
		System.out.println("Returns existing file!");
	}
	
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	
	while(br.ready()){
		System.out.println(br.readLine());
	}
	br.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//FileWriter fw = new FileWriter(file);
	/*FileWriter fw = new FileWriter(file, true);
	BufferedWriter bw = new BufferedWriter(fw);
	
	bw.write("RAMESHSOFT");
	bw.newLine();
	bw.write("91777 91456");
	bw.newLine();
	bw.write("MASTERS IN REAL TIME TRAINING");
	bw.newLine();
	
	bw.flush();
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
