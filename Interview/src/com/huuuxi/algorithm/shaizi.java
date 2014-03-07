package com.huuuxi.algorithm;
/**   
 * @Title: shaizi.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-3-7 上午12:12:35 
 */
public class shaizi {

	public static void show(){
		int a = 0,b=0,c=0,d=0,e=0,f=0;
		int sum = 0;
		int count = 0;
		while(a <=2){
			sum = sum+1*(a>0?1:0);
			while(b <= 4){
				sum = sum+2*(b>0?1:0);
				while (c <=4) {
					sum = sum+3*(c>0?1:0);
					while(d<=5){
						sum = sum+4*(d>0?1:0);
						while(e<=10){
							sum = sum+5*(e>0?1:0);
							while(f <= 8){
								sum = sum+6*(f>0?1:0);
								if (sum == 50&& (a+b+c+d+e+f) == 10) {
									System.out.println("success："+String.format("a:%d,b:%d,c:%d,d:%d,e:%d,f:%d", a,b,c,d,e,f));
									count++;
								}
								f++;
							}
							sum = sum - 6*(f-1);
							f=0;
							e++;
						}
						sum = sum - 5*(e-1);
						e=0;
						d++;
					}
					sum = sum - 4*(d-1);
					d=0;
					c++;
				}
				sum = sum - 3*(c-1);
				c=0;
				b++;
			}
			sum = sum - 2*(b-1);
			b=0;
			a++;
		}
		System.out.println("count:"+count);
	}
	
	public static void main(String[] args) {
		/*Long t  = System.currentTimeMillis();
		show();
		System.out.println(System.currentTimeMillis() - t);*/
		Object obj = new Object();
		System.out.println(obj.hashCode());
		String str = "aaa";
		String str2 = new String("aaa");
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
	}
}
