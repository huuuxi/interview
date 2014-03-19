package com.huuuxi.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**   
 * @Title: SychonizerTest.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-9 下午7:59:17 
 */
public class SychonizerTest {

	public static long Time(Executor executor, int concurrency ,final Runnable action) throws InterruptedException{
		final CountDownLatch ready = new CountDownLatch(concurrency);
		final CountDownLatch start = new CountDownLatch(1);
		final CountDownLatch done = new CountDownLatch(concurrency);
		
		for (int i = 0; i < concurrency; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
						ready.countDown();
						try {
							start.await();
							action.run();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}finally{
							done.countDown();
						}
				}
			});
		}
		ready.await();
		long startNano = System.nanoTime();
		start.countDown();
		done.await();
		return System.nanoTime() - startNano;
	}
	
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello,my mmi....");
				
			}
		});
		
		try {
			long t = Time(Executors.newFixedThreadPool(10), 10, th);
			System.out.println(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
}
