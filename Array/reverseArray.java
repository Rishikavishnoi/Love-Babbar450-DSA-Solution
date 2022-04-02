package dsaSheet450;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int start=0; //start at 0th position
		int end=arr.length-1;// end at last index
		while(start<end) {
			int temp=arr[start];  //swap arr[start] with arr[end]
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr)); //printing the modified array
	}

}
