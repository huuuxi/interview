package com.huuuxi.jdk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**   
 * @Title: SeralizeTest.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-6 上午11:46:28 
 */
public class SeralizeTest   implements Serializable {

		private static final long serialVersionUID = 1L;

		public static int staticVar = 5;

		public static void main(String[] args) {
			try {
				//初始时staticVar为5
				ObjectOutputStream out = new ObjectOutputStream(
						new FileOutputStream("result.obj"));
				out.writeObject(new SeralizeTest());
				out.close();

				//序列化后修改为10
				SeralizeTest.staticVar = 10;

				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
						"result.obj"));
				SeralizeTest t = (SeralizeTest) oin.readObject();
				oin.close();
				
				//再读取，通过t.staticVar打印新的值
				System.out.println(t.staticVar);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
