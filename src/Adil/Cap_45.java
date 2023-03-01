package Adil;

import java.util.Scanner;

public class Cap_45 {

	public String reverse(String str)
	{
		String st="";
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			st=ch+st;
		}
		return (st);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Sentence: ");
		String str=sc.nextLine();
		str=str.trim().replaceAll("//s+", " ");
		Cap_45 ob= new Cap_45();
		String rev=ob.reverse(str);
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		sc.close();
	}

}
