package chap18.four.two;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
				"src/chap18/four/two/FileInputStreamExample.java"
			);
			int data;
			
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
