package file_exception;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIOStream_Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("d:/file1.txt");
		int i;
		while((i=fis.read()) !=-1) {
			System.out.print((char)i);
		}
		fis.close();
	}

}
