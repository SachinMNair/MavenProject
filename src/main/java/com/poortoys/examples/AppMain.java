package com.poortoys.examples;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
       
    	
    	System.out.println("===========Enter toy name from below list=================");
    	System.out.println("1.Car\n2.Doll\n3.Cards");
    	Scanner sc = new Scanner(System.in);
    	
    	AppMain toy = new AppMain();
    	toy.returnprice(sc.next());
    	sc.close();
    	
    	
    }
    
    public void returnprice(String toy)
    {
    	switch(toy)
    	{
    	case "Car":
    		System.out.println("Price is 500 Rs");
    		break;
    	case "Doll":
    		System.out.println("Price is 1000 Rs");
        	break;
    	case "Cards":
    		System.out.println("Price is 100 Rs");
        	break;
    	default:
    		System.out.println("Please enter toy name from the given list");
        	break;

    	}
    	
    }

}
