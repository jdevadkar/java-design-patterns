package com.design.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * The Class DecoratorEverydayDemo.
 */
public class DecoratorEverydayDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		File file = new File("./output.txt");
		file.createNewFile();

		OutputStream oStream = new FileOutputStream(file);

		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("text");

		doStream.close();
		oStream.close();
	}

}
