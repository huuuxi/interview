package com.huuuxi.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.BitSet;

/**   
 * @Title: SerialBean.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-7 下午2:42:49 
 */
public class SerialBean  implements java.io.Serializable{

	public  int id;
	
	class SubCla extends SerialBean  implements java.io.Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public int idd;
	}
	
	public static void main(String[] args) {
		SerialBean.SubCla sub = new  SerialBean().new SubCla();
		try {
			FileOutputStream fileout = new FileOutputStream(new File("d://abc.txt"));
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(sub);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
