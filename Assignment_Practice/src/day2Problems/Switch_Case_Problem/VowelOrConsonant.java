//This program is to check whether the character is vowel or consonant by switch statement.

package day2Problems.Switch_Case_Problem;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the Character: "+"\n");
		char ch;
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		scan.close();
		
		switch (ch){
			//check lower case vowel letters
	    	case 'a':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'e':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'i':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'o':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'u':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	//check upper case vowel letters
	    	case 'A':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'E':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'I':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'O':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	case 'U':
	    		System.out.println(ch+" is a vowel");
	    		break;
	    
	    	default:
	    		if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
	    	        System.out.println(ch+" is a consonant");
	    	    }
	    	    else{
	    	        System.out.println(ch+" is not a Alphabets");
	    	    }
	    		break;
		}

	}

}
