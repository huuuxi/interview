package com.huuuxi.algorithm;

import java.lang.reflect.Field;

/**   
 * @Title: IntegerSwap.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-2-12 下午12:55:57 
 */
public class IntegerSwap {

	private static int a = 5,b=10;
	
	/** 
	* @Title: swap1 
	* @Description: 位运算
	* @Return: 
	*/
	public static void swap1(){
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a = "+a+" ;b =" +b);
	}
	/** 
	* @Title: swap2 
	* @Description: 加法运算
	* @Return: 
	*/
	public static void swap2(){
		a = a+b;
		b = a -b;
		a = a -b;
		System.out.println("a = "+a+" ;b =" +b);
	}
	
	public static void compare() {
		   // 1
		   double o = Double.longBitsToDouble(0x7ff8000000000000L);
		   System.out.println(o != o);
		   // 2
		   System.out.println(Float.NaN != Float.NaN);
		   System.out.println((Double.NaN != Double.NaN) + "\n");
		}
	
	public static void swapInt(){
		Integer m = new Integer(11);
		Integer n = new Integer(2);
		swap(m,n);
		System.out.println("m and n is :"+m+" "+n);
		
	}
	public static void swap(Integer m,Integer n){
		try {
			int _m = m;
			Field field = Integer.class.getDeclaredField("value");
			field.setAccessible(true);
			field.setInt(m, n.intValue());
			field.setInt(n, _m);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/** 
	* @Title: main 
	* @Description: 
	* @Return: 
	*/
	public static void main(String[] args) {
		//swap2();
		//compare();
		swapInt();
	}
}
