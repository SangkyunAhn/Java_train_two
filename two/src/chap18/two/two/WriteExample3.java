package chap18.two.two;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/chap18/temp/test.txt");
		byte[] data = "ABCD".getBytes();
		
		os.write(data, 1, 2);
		
		os.flush();
		os.close();
	}

}
