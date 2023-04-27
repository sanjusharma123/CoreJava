package file_exception;
import java.io.FileReader;
import java.io.IOException;

public class File_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr=new FileReader("d:/file1.txt");
int i;
while((i=fr.read()) !=-1) {
	System.out.print((char)i);
}
fr.close();
	}

}
