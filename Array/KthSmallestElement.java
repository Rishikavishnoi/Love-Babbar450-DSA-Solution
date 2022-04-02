package dsaSheet450;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr= {7,10,4,3,20,15};
		int k=3;
	  int ans= kthSmallest( arr, 0, arr.length-1,3 ) ;
   System.out.println(ans);
	}

	private static int kthSmallest(int[] arr, int l, int r, int k) {
		 //1st Approach
//        Arrays.sort(arr);
//        return arr[k-1];
        
        // 2nd Approach
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for(int i = k; i<arr.length; i++){
            if(pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        return pq.peek();
        
	}

}
