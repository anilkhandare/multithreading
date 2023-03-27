package com.expertit.thread;

public class MainClass9 {
 public static void main(String[] args) {
	 ThreadDemo9 t9=new ThreadDemo9();
	 t9.setPriority(1);
	 t9.start();
	 for(int i=0;i<5;i++){
		 System.out.println("main thread");
	 }
	 
}
}
