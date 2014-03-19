package com.huuuxi.jdk;


/**   
 * @Title: MainTest.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-9 下午4:18:18 
 */
public class MainTest {
	/*public static void main(String[] args) {
		if (args.length == 0) {
			throw new NullPointerException();
		}
		for(EnumTest e : EnumTest.values()){
			System.out.println(e);
			
		}
	}*/
	static{
		int x = 5;
	}
	static int x,y;
	public static void main(String args[]){
		x--;
		System.out.println(x);
		myMethod();
		System.out.println(x+y+ ++x);
	}
	public static void myMethod(){
		y = x++ + ++x;
		System.out.println(y);
		System.out.println(x);
	}
	
}
