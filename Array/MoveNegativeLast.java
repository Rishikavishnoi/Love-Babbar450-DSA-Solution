package dsaSheet450;

import java.util.Arrays;

public class MoveNegativeLast {

	public static void main(String[] args) {
		int[] arr= {1,-1,3,2,-7,-5,11,6};
		int n=arr.length;
		segregateElements(arr, n);
		System.out.println(Arrays.toString(arr));
	}
    //gfg solution class code 
	private static void segregateElements(int[] arr, int n) {
		int[] arr2=new int[n];
	       int pos=0;      //For positive no
	       for(int i=0;i<n;i++){
	           if(arr[i]>0){
	               arr2[pos]=arr[i];
	               pos++;
	           }
	       }
	       int neg=pos;    //For Negative no
	       for(int i=0;i<n;i++){
	           if(arr[i]<0){
	               arr2[neg]=arr[i];
	               neg++;
	           }
	       }
	       for(int i=0;i<n;i++){
	           arr[i]=arr2[i];
	       }
	    }
	
	}


