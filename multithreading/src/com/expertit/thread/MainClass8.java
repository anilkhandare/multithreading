package com.expertit.thread;

public class MainClass8 {
 public static void main(String[] args) {
	System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(7);
	ThreadDemo8 t8=new ThreadDemo8();
	System.out.println(t8.getPriority());
}
}
