package dsaSheet450;

import array.Pair;
class pair{
	long first,second;
	public pair(long first,long second){
		this.first=first;
		this.second=second;
	}
}

public class MaxMinArray {

	public static void main(String[] args) {
	long[]  arr= {1, 345, 234, 21, 56789};
	long n=arr.length;
	//Compute obj=new Compute();
	pair product =getMinMax( arr,  n);
	System.out.println(product.first+" "+ product.second);
	
	}
	private static pair getMinMax(long[] arr, long n) {
		long min=arr[0];
	    long max= 0;
	    for(int i=0;i<arr.length;i++) {
	    	max=Math.max(max, arr[i]);
	    	min=Math.min(min, arr[i]);
	    	
	    }
	    return new pair(min, max);
		}
		
	}

	
