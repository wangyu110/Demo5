package com.day5.demo;

import java.util.Arrays;

public class Demo1 {
	/**
	 * ���S���M�ķ��D
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
	 * ����S���M�Y�����ֵ
	 */
	public void Demo2(){
		int[][] num={{2,6,3},{4,1,6},{7,8,9}};
		int max=num[0][0];   //���x���ֵ
		int min =num[0][0];   //���x��Сֵ
		for(int i=0;i<num.length;i++){
			for (int j=0;j<num[i].length;j++){
				if(num[i][j]>max){   //�Д����M���ֵ
					max=num[i][j];   	
				}				
				if(num[i][j]<min){   //�Д����M��Сֵ
					min=num[i][j];
				}		 
			} 
		}
		System.out.print( "���ֵ��"+max);
		System.out.print( "��Сֵ��"+min);
	}
	/**
	 * ���S���M������
//	 */
//	public void Demo1(){
//		int[][] arr1={{4,5,1,6,22},{56,23,14,53,2,},{55,86,34,52,33},{53,74,23,46},};
//		
//	}
	/**
	 * 
	 * ���M������
	 */
	public void Demo(){
		int[] arr= {2,6,1,99,4,36};  //���x���M
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if (arr[i]<arr[j]) {
					arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]); //���Q׃��
				}
			}	 
		}
		System.out.print(Arrays.toString(arr));
	}
	

}
