package dsaSheet450;

import java.util.Arrays;

public class RotationArrayByOne {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=arr.length;
		rotate( arr, n);
		System.out.println(Arrays.toString(arr));
	}
  public static void rotate(int[] arr ,int n) {
	  int x=arr[n-1];
	  for(int i=n-2;i>=0;i--) {
		  arr[i+1]=arr[i];
	  }
	  arr[0]=x;
  }
}
