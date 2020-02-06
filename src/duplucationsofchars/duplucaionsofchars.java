
package duplucationsofchars;

import java.util.*; 


public class duplucaionsofchars {
	public static void main(String[] args)  {
		 String str = "baris anknlnbfsar";
		  int cnt = 0;
		  int sum = 0
				  ;
		  char[] inp = str.toCharArray();
		  
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		    	
		     System.out.println(inp[j]+":"+ cnt);
		     cnt++;
		     
		    }
		   }
		  }
		 }
		

	}

