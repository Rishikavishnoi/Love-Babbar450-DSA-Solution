package dsaSheet450;

import java.io.Console;

public class KadaneAlgo {

	public static void main(String[] args) {
		int[] arr= {1,2,3,-2,5};
		int n=arr.length;
		int ans= maxSubarraySum( arr, n);
		System.out.println(ans);
		}

	private static int maxSubarraySum(int[] arr, int n) {
		 int currSum=0;
	       int overallSum=arr[0];
	       for(int i=0;i<n;i++){
	           if(currSum>=0){
	               currSum+=arr[i];
	           }else currSum=arr[i];
	           
	           if(currSum>overallSum){
	               overallSum=currSum;
	           }
	       }
	      return overallSum;
	        
	    }
		
	

}
