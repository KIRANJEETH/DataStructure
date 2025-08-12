package searching;
import java.util.*;
public class BinarySearch1 {
	public static int binary(int[] arr,int target) {
		int low=0,high=arr.length-1;
		Arrays.sort(arr);
		while(low<=high) {
			int mid=(high+low)/2;
			if (arr[mid]==target) return mid;
			else if(arr[mid]<target)low=mid+1;
			else high=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size:");
		int size=sc.nextInt();
		System.out.println("Enter The Target:");
		int target=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int index=binary(arr,target);
		if(index!=-1) {
			System.out.println("Index=="+index);
		}
		else {
			System.out.println("Element Not Found");
		}
	}
}
