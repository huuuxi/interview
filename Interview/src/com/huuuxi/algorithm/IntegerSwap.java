package com.huuuxi.algorithm;
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
	public static void main(String[] args) {
		//swap2();
		compare();
	}
}
