package dsaSheet450;

import java.util.Arrays;

public class Sort01array {

	public static void main(String[] args) {
		int arr[]= {1,2,0,0,0,1,1,2,0};
		int n=arr.length;
		Sort012(arr,n);
		System.out.println(Arrays.toString(arr));

	}
  // gfg solution start here in solution class
	private static void Sort012(int[] a, int n) {
		int count0=0;   //it count no of 0 in array
        int count1=0;   //it count no of 1 in arary
        int count2=0;   //it count no of 2 in array 
        for(int i=0;i<n;i++){
        	 switch (a[i]) {
             case 0:
                 count0++;
                 break;
             case 1:
                 count1++;
                 break;
             case 2:
                 count2++;
                 break;
             }
        }
        for(int i=0;i<n;i++){
           if(count0!=0){
               a[i]=0;
               count0--;
           }
           else if(count1!=0){
               a[i]=1;
               count1--;
           }
           else {
               a[i]=2;
           count2--;
               
           }
        }
		
	}

}
