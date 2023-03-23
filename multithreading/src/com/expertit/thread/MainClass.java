package com.expertit.thread;

public class MainClass {
 public static void main(String[] args) {
	 ThreadDemo1 threadDemo1=new ThreadDemo1();
	  //threadDemo1.run();
	 threadDemo1.start();
	 threadDemo1.start();
	 
	 for(int i=0;i<5;i++){
		 System.out.println("main thread");
	 }
	 
}
}
