package filehandling.java.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling {
public static void main(String[] args) throws IOException {
	BufferedReader br1= new BufferedReader(new FileReader("file1.txt"));
	BufferedReader br2= new BufferedReader(new FileReader("file2.txt"));
}
}
