package com.huuuxi.algorithm;

import java.util.HashMap;
import java.util.Map;

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
	* @Title: halfInsertSort 
	* @Description: 折半插入排序
	* @Return: 
	*/
	public static void halfInsertSort(){
		for(int i = 1;i<array.length;i++){
			int low = 0,high=i-1;
			int temp = array[i];
			while(low <= high){
				int m =  (low+high) / 2;
				if (temp <= array[m]) {
					high = m-1;
				}else{
					low = m+1;
				}
			}
			for (int j = i; j >= low+1; j--) {
				array[j] = array[j-1];
			}
			array[low] = temp;
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
	
	/** 
	* @Title: mergeSort 
	* @Description: 归并排序
	* @Return: 
	*/
	public static void  mergeSort(int[] array, int start ,int end ,int[] temp){
		int mid = (start+end)/2;
		if (start < end) {
			mergeSort(array,start , mid,temp);
			mergeSort(array, mid+1, end,temp);
			mergeArray(array,start,mid,end,temp);
		}
	}
	public static void mergeArray(int[] array ,int start, int mid ,int end,int[] temp){
		int i = start,j=mid+1;
		int m = mid,n = end;
		int k = 0;
		while (i<=m && j <=n) {
			if (array[i] <= array[j]) {
				temp[k++] = array[i++] ;
			}else {
				temp[k++] = array[j++] ;
			}
		}
		while(i <=m){
			temp[k++] = array[i++];
		}
		while(j <=n){
			temp[k++] = array[j++];
		}
		for (int h = 0;h<k ;h++) {
			array[start+h] = temp[h];
		}
		
	}
	
	
	/** 
	* @Title: shellSort 
	* @Description: 希尔排序
	* @Return: 
	*/
	public static void shellSort(int d,int dataNum){
		for(int i = d;i<dataNum;i++){
			int j = i-d;
			int temp = array[i];
			while(j>=0 && array[j] > temp){
				array[j+d] = array[j];
				j -= d;
			}
			if (j != i -d) {
				array[j+d] = temp;
			}
		}
	}
	public static void ShellSortNum(){
		int d = array.length /2;
		while (d >=1) {
			shellSort(d, array.length);
			d = d/2;
		}
	}
	
	public static void main(String[] args) {
		//insertSort();
		//selectSort();
		//bubbleSort();
		//halfInsertSort();
		/*int[] temp = new int[array.length];
		mergeSort(array, 0, array.length-1, temp);
		for(int m = 0;m<temp.length;m++){
			System.out.println(temp[m]);
		}*/
		/*quickSort(0,array.length-1);*/
		/*ShellSortNum();
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}*/
		
		
	}
}
