package com.zhang.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;

public class Client {

	//多线程测试单例模式不同实现的执行效率
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();	
		int threadNum = 10;
		final CountDownLatch count = new CountDownLatch(threadNum); //有10个线程
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i <10000; i++) {
						Demo3 d  = Demo3.getInstance();
					}	
					count.countDown();//每个线程执行完毕后，计数器减1
				}
			}).start();
		}
		
		
		count.await();//等待全部线程执行完毕后，才向下执行
		long end = System.currentTimeMillis();
		System.err.println(end- start);
	}
}
