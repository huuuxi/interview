package com.huuuxi.jdk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**   
 * @Title: ReferTest.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-4 上午9:19:21 
 */
public class ReferTest {

	class h{
		public int i = 10;
		public StringBuffer buff = new StringBuffer("abcd");
	}
	public static void main(String[] args) {
		ReferTest test = new ReferTest();
		test.amethod();
	}
	
	public void amethod(){
		h hh = new h();
		hh.i = 30;
		hh.buff.append("dddd");
		swit(hh);
		//hh = new h();
		System.out.println(hh.i+" "+hh.buff.toString());
	}
	public void swit(h hh){
//		hh.buff.append("ddddddddddddss");
//		hh.i = 999;
		h ts = new h();
		ts.i = 9;
		hh = ts;
		
		File f = new File("aa");
		InputStream input = new FileInputStream(f);
		InputStreamReader r = new InputStreamReader(input);
		BufferedReader reader = new BufferedReader(r);
	}
	
}
