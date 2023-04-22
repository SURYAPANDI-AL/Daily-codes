package day1;

import java.util.Arrays;

public class MoveZeros {
	public static void main (String [] args) {
		int [] arr = {1,2,0,4,3,0,5,0};
		MoveZeros.moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void moveZeros(int[] arr) {
		int ptr1=0,ptr2=0;
		while(ptr2 != arr.length) {
			if(arr[ptr2]!=0) {
				arr[ptr1]=arr[ptr2]+arr[ptr1]-(arr[ptr2]=arr[ptr1]);
				ptr1++;ptr2++;
			}else {
				ptr2++;
			}
		}
	}
}
