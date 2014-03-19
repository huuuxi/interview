package com.huuuxi.thread;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;

/**   
 * @Title: TreadPool.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-4 下午12:30:11 
 */
public class TreadPool {

	class MyThread implements Runnable{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" is running...");
			try {
				Thread.currentThread().sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class extendThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		}
	}
	
	public  void pool(){
		ExecutorService pool = Executors.newFixedThreadPool(2);
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		/*Thread t = new Thread(t1);
		t.start();*/
		
		/*extendThread et = new extendThread();
		et.run();*/
		
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.shutdown();
	}
	public static void main(String[] args) {
		TreadPool tp = new TreadPool();
		tp.pool();
		ThreadPoolExecutor;
		Future<V>;
		FutureTask<V>;
		Callable<V>;
		
		Lock;
		Thread;
		ThreadLocal<T>; // hibernate . spring aop transcation use this ,only a copy 
		
		
		
		
		MyThread t1 = new TreadPool().new MyThread();
		Thread t = new Thread(t1);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("over");
	}
}
