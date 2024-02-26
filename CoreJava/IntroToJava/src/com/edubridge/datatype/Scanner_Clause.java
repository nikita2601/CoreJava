
package com.edubridge.datatype;
import java.util.Scanner;
public class Scanner_Clause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name :");
		String pname=sc.nextLine();
		System.out.println("enter the quantity:");		
		int qty = sc.nextInt();
		System.out.println("enter price");
		int price= sc.nextInt();
		System.out.println("product name"+pname+"\n quantity"+qty+"\nprice"+price);
		
	}

}
