package filehandling.java.ex;

 import java.io.*;
import java.sql.SQLException;
public class FileHandling {
public static void main(String[] args) throws IOException {
	FileWriter fw= new FileWriter("info.txt", true);
	fw.write(73);
	fw.write("\n");
	fw.write("Ineuron");
	fw.write("\n");
	fw.write("tech");
	fw.write("\n");
	fw.write("Pvt.");
	fw.write("\n");
	fw.write("LTD.");
	fw.flush();
	fw.close();
	FileReader fr= new FileReader("info.txt");
	int i=fr.read();
	//System.out.println(i);
	while (i!=-1) {
		i=fr.read();
		System.out.print((char)i);
	}
	fr.close();
}
}
