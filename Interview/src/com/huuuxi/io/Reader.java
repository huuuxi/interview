package com.huuuxi.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**   
 * @Title: Reader.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-2-21 下午5:51:55 
 */
public class Reader {

	
	public static void readline(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		do {
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(str);
		} while (!str.equals("stop"));
		
	}
	
	public static void main(String[] args) {
		readline();
	}
}
