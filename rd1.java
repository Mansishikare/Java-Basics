package mansi;

import java.util.Scanner;

public class rd1 {
public static void  main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=scanner.nextLine();
	System.out.println("characters in the string:");
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		System.out.println(ch);
	}
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		int asciivalue=(int)ch;
		System.out.println(" ascii value of " +   ch +   "  is:  " +asciivalue);
	}
	scanner.close();
}
}
