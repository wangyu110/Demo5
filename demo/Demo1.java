package com.day5.demo;

import java.util.Arrays;

public class Demo1 {
	/**
	 * 二維數組的反轉
	 */
	public void Demo3(){
		int[][] num1={{1,2,3},{4,5,6,},{7,8,9}};
		 
//		for(int i=0;i<num1.length;i++){
//			for(int j=0;j<num1[i].length;j++){
//				int temp=num1[j][i];
//			//	System.out.print(num1[i][j]);
//			 num1[j][i]=num1[i][j];
//			 num1[i][j]= temp;
//			}
//		}
		for(int i=0;i<num1.length;i++){
			for(int j=0;j<num1[i].length;j++){
				System.out.print(num1[j][i]+" ");
			}
			System.out.println(" ");
		}
	 
		 
	}
	/**
	 * 求二維數組裏面的最值
	 */
	public void Demo2(){
		int[][] num={{2,6,3},{4,1,6},{7,8,9}};
		int max=num[0][0];   //定義最大值
		int min =num[0][0];   //定義最小值
		for(int i=0;i<num.length;i++){
			for (int j=0;j<num[i].length;j++){
				if(num[i][j]>max){   //判斷數組最大值
					max=num[i][j];   	
				}				
				if(num[i][j]<min){   //判斷數組最小值
					min=num[i][j];
				}		 
			} 
		}
		System.out.print( "最大值："+max);
		System.out.print( "最小值："+min);
	}
	/**
	 * 二維數組的排序
//	 */
//	public void Demo1(){
//		int[][] arr1={{4,5,1,6,22},{56,23,14,53,2,},{55,86,34,52,33},{53,74,23,46},};
//		
//	}
	/**
	 * 
	 * 數組的排序
	 */
	public void Demo(){
		int[] arr= {2,6,1,99,4,36};  //定義數組
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if (arr[i]<arr[j]) {
					arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]); //交換變量
				}
			}	 
		}
		System.out.print(Arrays.toString(arr));
	}
	

}
