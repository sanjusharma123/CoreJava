package file_exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeseralization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("d:/mytest.txt");
ObjectInputStream oos=new ObjectInputStream(fis);
Student s=(Student) oos.readObject();
System.out.println("Student Details:-");
System.out.println("id :=" +s.id);
System.out.println("name :=" +s.name);
System.out.println("city :=" +s.city);
	}

}
