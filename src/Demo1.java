import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;


public class Demo1 {

	public static void main(String[] args) throws IOException {
		String data = "helloo im in file";
		File file = new File("abc.txt");
		FileOutputStream fout = new FileOutputStream(file);
		
		byte[] b = data.getBytes();
		fout.write(b);;
		fout.close();
		
	}
}