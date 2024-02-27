package com.string;

public class StringVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str ="The Rain in the spain";
      System.out.println("The string is:"+str);
      int vcount=0,ccount=0;
      str=str.toLowerCase();
      for(int i=0;i<str.length();i++)
      {
    	  if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
    	  
    		  vcount++ ; // increment each time vowel encounters
    	  else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
    		  ccount++; // increment each time consonant encounters
      }
      //print the total number of vowels
      System.out.println("The total number of vowels are:"+vcount);
      //print the total number of consonants
      System.out.println("The Total number of consonant is:"+ccount);
      
    	  
    		  
      }
	}


