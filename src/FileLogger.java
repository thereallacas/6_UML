import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : FileLogger.java
//  @ Date : 10/19/2015
//  @ Author : 
//
//

public class FileLogger implements Observer {
	String fileName = "file.txt";
	PrintWriter pw;

	public FileLogger(String fileName, PrintWriter pw) {
		this.fileName = fileName;
			this.pw = pw;
	}

	@Override
	public void report(Observable observable) {
		// try {
		// File test = new File(fileName);
		// boolean t =
		// Math.abs(test.lastModified()-(System.currentTimeMillis()))<1000 ?
		// true : false;
		// PrintWriter pw = new PrintWriter(new FileWriter(fileName));
		pw.println(observable.toString());
		// pw.flush();
		// pw.close();
		/**
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 **/

	}
}
