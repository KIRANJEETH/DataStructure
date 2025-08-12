package searching;

import java.util.Scanner;

public class LinearSearch2 {
	public static int linearSearch(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:	");
		int size=sc.nextInt();
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int index=linearSearch(arr,target);
		if(index!=-1) {
			System.out.println("index=="+index);
		}
		else {
			System.out.println("Element Not Found ❌!!!❌");
		}
	}
}
