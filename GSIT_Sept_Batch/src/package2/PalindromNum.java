package package2;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
		int total = num;
		
		int rem; int sum =0; //123
		
		while(num >0) {
			rem = num % 10; //1
			sum = sum * 10 +rem; //321
			num = num/10; //1
			
		}
		
		if(sum==total) 
		{
			System.out.println("Its Palindrom Number");
		}
		else {
			System.out.println("Its Not Palindrom Number");
		}
	}

}
