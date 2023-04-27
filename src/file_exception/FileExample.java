package file_exception;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File newFile = new File("d:/ListOfCourses.txt");
		if (newFile.createNewFile()) {
			System.out.println("File created.");
		} else {
			System.out.println("File exists.");
		}
	}
}