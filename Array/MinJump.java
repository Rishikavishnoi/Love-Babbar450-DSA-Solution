package dsaSheet450;



public class MinJump {

	public static void main(String[] args) {
		int[] arr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
		int ans= minJumps( arr);
	  System.out.println(ans);
	}

	private static int minJumps(int[] arr) {
		
		int n=arr.length;
	    if (n <= 1) return 0;
	     if(arr[0]==0) return -1;
	    int currMaxReach = arr[0];
	    int stepsCount = arr[0];
	    int jump = 0;
	    for (int start = 1; start < n - 1; start = start + 1)
	    {
	        currMaxReach = Math.max(currMaxReach, start + arr[start]);
	        stepsCount = stepsCount - 1;
	        if (stepsCount == 0)
	        {
	            jump = jump + 1;
	            if(start>=currMaxReach) return -1;
	            stepsCount = currMaxReach - start;
	        }
	    }
	    return jump + 1;
	}

}
