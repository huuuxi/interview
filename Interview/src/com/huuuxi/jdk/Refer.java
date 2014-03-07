package com.huuuxi.jdk;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.soap.MimeHeader;

/**   
 * @Title: Refer.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-3 下午11:12:41 
 */
public class Refer {

	/** 
	* @Title: main 
	* @Description: String is final class ,so it value,but StringBuff is refer,so it is refer
	* @Return: 
	*/
	public static void main(String[] args) {
		Map<String ,String> map = new HashMap<String, String>();
		map.put("a", "abc");
		String temp = map.get("a");
		temp = "abcd";
		System.out.println(map.get("a"));
		
		Map<String, StringBuffer> maps = new HashMap<String, StringBuffer>();
		maps.put("b", new StringBuffer("abcdefg"));
		StringBuffer buff = maps.get("b");
		buff.append("ddddd");
		System.out.println(buff.toString());
		System.out.println(maps.get("b").toString());
		
	}
}
