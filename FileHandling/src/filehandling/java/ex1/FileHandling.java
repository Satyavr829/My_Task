package filehandling.java.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class FileHandling {
public static void main(String[] args) throws IOException {
	FileWriter fw= new FileWriter("testapp.txt");
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("New");
	bw.newLine();
	bw.write("file");
	bw.newLine();
	bw.write("Object");
	bw.newLine();
	bw.write("is created");
	bw.newLine();
	bw.close();
	FileReader fr= new FileReader("testapp.txt");
	BufferedReader br= new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}
}
}
