package day1;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSort {
	public static void main (String [] args) {
		int[][] arr = {{5,1,4,3},{6,4,3,1},{8,3,7,2},{9,4,9,6}};
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n==1) {
			MatrixSort.horizontal(arr);
		}else if(n==2) {
			MatrixSort.vertical(arr);
		}else if(n==3){
			MatrixSort.diagnol(arr);
		}
		for(int i[]: arr) {
			System.out.println(Arrays.toString(i));
		}
	}
	private static void diagnol(int[][] arr) {
		for(int k=0;k<arr.length;k++) {
			int tempArr[]=new int[arr.length-k];
			for(int i=0+k,j=0;i<arr.length && j<arr.length;i++,j++) {
				tempArr[j]=arr[i][j];
			}
			MatrixSort.sort(tempArr);
			for(int i=0+k,j=0;i<arr.length && j<arr.length;i++,j++) {
				arr[i][j]=tempArr[j];
			}
		}
		for(int k=0;k<arr.length;k++) {
			int tempArr[]=new int[arr.length-k];
			for(int i=0,j=0+k;i<arr.length && j<arr.length;i++,j++) {
				tempArr[i]=arr[i][j];
			}
			MatrixSort.sort(tempArr);
			for(int i=0,j=0+k;i<arr.length && j<arr.length;i++,j++) {
				arr[i][j]=tempArr[i];
			}
		}
	}
	private static void vertical(int[][] arr) {
		for(int j=0;j<arr.length;j++) {
			int tempArr[] = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				tempArr[i]=arr[i][j];
			}
			MatrixSort.sort(tempArr);
			for(int i=0;i<arr.length;i++) {
				arr[i][j]=tempArr[i];
			}
		}
	}
	private static void horizontal(int[][] arr) {
		for(int i[]:arr) {
			MatrixSort.sort(i);
		}
	}
	private static void sort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[j]+arr[i]-(arr[j]=arr[i]);
				}
			}
		}
	}
}
