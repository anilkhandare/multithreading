package com.expertit.thread;

public class MainClass7 {
  public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	ThreadDemo7 t7=new ThreadDemo7();
	
	System.out.println(t7.getName());
	t7.setName("ThreadDemo7");
	System.out.println(t7.getName());
	Thread.currentThread().setName("mainthreadname");
	System.out.println(Thread.currentThread().getName());
	
}
}
