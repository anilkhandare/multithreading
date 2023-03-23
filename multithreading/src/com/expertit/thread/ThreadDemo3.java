package com.expertit.thread;

public class ThreadDemo3 extends Thread{
public void run(){
	System.out.println("no arg run method ");
}
public void run(int i){
	System.out.println("with arguments run method");
}
}
