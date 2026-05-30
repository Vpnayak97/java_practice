package vpn1;

import java.util.Scanner;

public class stringw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int vowels=0;
		int consonants=0;
		for(int i=1;i<arr.length;i++) {
			char ch=arr[i];
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				vowels++;
			}else if(Character.isLetter(ch)) {
			consonants++;

				}}
			System.out.println(vowels);
			System.out.println(consonants);
			}
		}
