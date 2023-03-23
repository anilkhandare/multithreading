package com.expertit.thread;

public class ThreadDemo1 extends Thread{
  public void run(){
	  for(int i=0;i<5;i++){
		  System.out.println("child thread");
	  }
  }
}
