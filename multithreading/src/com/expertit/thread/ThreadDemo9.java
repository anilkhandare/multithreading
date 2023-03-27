package com.expertit.thread;

public class ThreadDemo9 extends Thread{
  public void run(){
	  for(int i=0;i<6;i++){
		  System.out.println("child thread");
	  }
  }
}
