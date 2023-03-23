package com.expertit.thread;

public class ThreadDemo4 extends Thread {
  public void start(){
	  super.start();
	  System.out.println("override start method");
  }
  public void run(){
	  System.out.println("override run method");
  }
}
