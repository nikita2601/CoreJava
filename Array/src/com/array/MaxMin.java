package com.array;

import java.lang.reflect.Array;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,45,15,10};
		int min=array[0];
		int max=array[0];
      for(int i=1;i<array.length;i++)
    		  {
    			  if(array[i]>max) {
    				  //update maximum value
    				  max=array[i];
    				  
    			  }
    		  
    		  if(array[i] < min) {
    			  //update minimum value
    			  min = array[i];
    		  }
	}
      System.out.println("Maximum Value:"+max);
	System.out.println("Minimum Value:"+min);


}
}
