//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : StdOutLogger.java
//  @ Date : 10/19/2015
//  @ Author : 
//
//




public class StdOutLogger implements Observer {

	@Override
	public void report(Observable observable) {
		System.out.println(observable.toString());
	}
}
