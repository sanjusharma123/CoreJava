package file_exception;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileWrite_Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("d://file1.txt");
fw.write("my first writing file");
System.out.println("write succesfully");
fw.close();
	}

}
