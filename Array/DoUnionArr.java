package dsaSheet450;

import java.util.*;


public class DoUnionArr {

	public static void main(String[] args) {
		
			int[] a= {1,2,3,4,5};
			int[] b= {1,2,3};
	       int n=a.length;
	       int m=b.length;
	      int noUnion= doUnion(a,n,b,m);
	      System.out.println(noUnion);
		}

		private static int doUnion(int[] a, int n, int[] b, int m) {

	          Set<Integer> union = new HashSet<>();
	      
	      for(int i=0;i<n;i++)
	      {
	          union.add(a[i]);
	      }
	      
	      for(int i=0;i<m;i++)
	      {
	          union.add(b[i]);
	      }
	      
	      int count=union.size();
	      
	      return count;
			
		}


	

}
