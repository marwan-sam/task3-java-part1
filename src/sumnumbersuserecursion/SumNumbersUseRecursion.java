/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumbersuserecursion;

import java.util.Scanner;

public class SumNumbersUseRecursion {

    
    public static void main(String[] args) {
	
    	System.out.println("INPUT NUMBER: ");
    	Scanner input = new Scanner(System.in);
    	int  n = input.nextInt();
    	      
    	
    	int total = getTotal(n);
    	System.out.println("SUM BY RECURSION = " + total);
    	 input.close();
    }

    private static int getTotal(int num) {
            if (num != 0) {
    	    return num + getTotal(num - 1);
    	}else {
    	      return num;
    	}    
    }
    
}
