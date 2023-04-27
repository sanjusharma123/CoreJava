package file_exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Studentseralization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fis=new FileOutputStream("d://mytest.txt");
ObjectOutputStream oos=new ObjectOutputStream(fis);
Student s=new Student();
s.id=1;
s.name="sanju";
s.city="thane";
oos.writeObject(s);
System.out.println("Data Saved Succefully");
oos.close();
	}

}
