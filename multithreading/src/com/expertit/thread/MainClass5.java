package com.expertit.thread;

public class MainClass5 {
public static void main(String[] args) {
	ThreadDemo5 threadDemo5=new ThreadDemo5();
	//threadDemo5.run();work as normal method
	Thread t=new Thread(threadDemo5);
	t.start();
	
	for(int j=0;j<5;j++){
		System.out.println("main thread");
	}
	//threadDemo5.
}
}
