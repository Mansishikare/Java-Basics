//write a java program to rotating array k times..then the array has some 6 values ..after cyclic
 //rotation k of two times result?

package test;
import java.util.Arrays;
import java.util.Scanner;
public class a1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in the array:");
	int n=sc.nextInt();
	int[] arr=new int[n];

	System.out.println("Enter the elemnts in array:");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		}
	System.out.println("Enter the number of times to rotate the array:");
	
	int k=sc.nextInt();
	k%=n;
	for(int i=0;i<k;i++) {
		rotateonces(arr);
	}
	
	System.out.println("rotate array:");
	for(int i=0;i<n;i++)
	{
		System.out.print(arr [i] +" ");
	}
	}

private static void rotateonces(int[] arr) {
	// TODO Auto-generated method stub
	int temp=arr[arr.length -1];
	for(int  i=arr.length-1;i>0;i--) {
		arr[i]=arr[i-1];
	}
	arr[0]=temp;
}
}


