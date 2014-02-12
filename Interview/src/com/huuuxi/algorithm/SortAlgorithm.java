package com.huuuxi.algorithm;
/**   
 * @Title: SortAlgorithm.java 
 * @Description: 
 * @author huuuxi 
 * @Email huuuxi@gmail.com 
 * @date 2014-2-11 下午12:09:41 
 */
public class SortAlgorithm {

	public static int[] array = {2,1,6,8,4,99,22,33,55,12,15};
	
	
	/** 
	* @Title: insertSort 
	* @Description: 插入排序
	* @Return: 
	*/
	public static void insertSort(){
		int temp;
		for(int i =1;i<array.length;i++){
			int j = i -1;
			temp = array[i];
			for(;j>=0 &&temp <array[j] ;j--){
				array[j+1] = array[j];
			}
			array[j+1] = temp;
		}
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}
	}
	/** 
	* @Title: selectSort 
	* @Description: 选择排序
	* @Return: 
	*/
	public static void selectSort(){
		int size = 1;
		for(int j=0 ; j< array.length ;j++){
			int t = size;
			int swap;
			int temp = size-1;
			for(; t<array.length ;t++){
				if (array[t] <array[temp]) {
					temp = t;
				}
			}
			swap = array[size-1];
			array[size-1] = array[temp];
			array[temp] = swap;
			size++;
		}
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}
	}
	
	/** 
	* @Title: bubbleSort 
	* @Description: 冒泡排序
	* @Return: 
	*/
	public static void bubbleSort(){
		int swap;
		for(int i = 0 ;i < array.length;i++){
			for(int  j = 1 ;j < array.length-i;j++){
				if(array[j-1] > array[j]){
					swap = array[j-1];
					array[j-1] = array[j];
					array[j] = swap;
				}
			}
		}
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}
	}
	
	/** 
	* @Title: quickSort 
	* @Description: 快速排序
	* @Return: 
	*/
	public static void quickSort(int begin,int end){
		int _begin = begin,_end = end;
		int temp = array[begin];
		while(begin < end){
			while (begin < end && array[end] >= temp) {
				end --;
			}
			array[begin] = array[end];
			while (begin <end && array[begin] <= temp) {
				begin++;
			}
			array[end] = array[begin];
		}
		array[begin] = temp;
		if (_begin < begin -1) {
			quickSort(_begin, begin -1);
		}
		if (begin+1 < _end) {
			quickSort(begin+1, _end);
		}
		
	}
	
	public static void main(String[] args) {
		//insertSort();
		//selectSort();
		//bubbleSort();
		quickSort(0,array.length-1);
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}
	}
}
