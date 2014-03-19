package com.huuuxi.jdk;
/**   
 * @Title: ClassLoaderTest.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-13 上午12:16:44 
 */
public class ClassLoaderTest {

	/** 
	* @Title: main 
	* @Description: 
	* @Return: 
	*/
	public static void main(String[] args) {
		ClassLoaderTest test = new ClassLoaderTest();
		ClassLoader loader = test.getClass().getClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());
	}
}
