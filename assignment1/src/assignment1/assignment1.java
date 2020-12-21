package assignment1;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("****************Welcome to MSZ STORE*******************");
		
		
		
		System.out.print("What is  your name: ");
		String name = input.nextLine();
		System.out.println("Name: " + name);
		
		System.out.print("What type of phone u want to buy: ");
		String type = input.nextLine();
		System.out.println("Type: " + type);
		
		System.out.print("how much u want to buy: ");
		String HowMuch = input.nextLine();
		System.out.println("How much: " + HowMuch);
		
		System.out.println("**Phone list**");
		System.out.println("**************************");
		System.out.println("**Iphone**");
		System.out.println("Iphone 12 Pro Max");
		System.out.println("Iphone 12 Pro");
		System.out.println("Iphone 12");
		System.out.println("Iphone 12 mini");
		System.out.println("Iphone SE 2nd Gen");
		System.out.println("Iphone 11 ");
		System.out.println("Iphone 11 Pro Max");
		System.out.println("Iphone 11 Pro");
		System.out.println("Iphone 11");
		System.out.println("Iphone XS Max");
		System.out.println("Iphone XS");
		System.out.println("Iphone XR");
		System.out.println("Iphone X");
		System.out.println("Iphone 8 Plus");
		System.out.println("Iphone 8");
		System.out.println("Iphone 7 Plus");
		System.out.println("Iphone 7");
		
		int number ,price , quantity;
		
		System.out.println("Enter the number of mobile phone :");
	    quantity = input.nextInt();
	    if (quantity==10) {
	    	
	    double quantity1,quantity2,quantity3,total_price;
	    double price1,price2,price3,discount,price_to_paid;
	    
	      
		System.out.println("Enter the price of iphone : Rm");
		 price1= input.nextInt();
		
		System.out.println("Enter the quantity of iphone :");
		 quantity1 = input.nextInt();
		 System.out.println();
		 
		System.out.println("Enter the price of asus : Rm");
		 price2= input.nextInt();
		
		System.out.println("Enter the quantity of asus :");
		 quantity2 = input.nextInt();
		System.out.println();

		System.out.println("Enter the price of vivo : Rm");
		 price3= input.nextInt();
		
		System.out.println("Enter the quantity of vivo :");
		 quantity3 = input.nextInt();
		 System.out.println();
		 
		 System.out.println("Total price buying the phone");
		 total_price =(price1*quantity1)+(price2*quantity2)+(price3*quantity3);
		 System.out.println("Total price: "+ total_price);
		 System.out.println();
		 
		 if (total_price>5000) {
			 discount = total_price*0.2;
		 }
		 
		 else {
			 discount=total_price*0.1;
		 }
		 System.out.println("Discount get after buying");
		 System.out.println("Discount: "+ discount);
		
		
		
		
		
		
		

	}
	}
}
