package dsaSheet450;
import java.util.*;

public class StackUsingTwoQueue {

	// { Driver Code Starts
	

	
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t>0)
			{
				Queues g = new Queues();
				
				int q = sc.nextInt();
				while(q>0)
				{
					int QueryType = sc.nextInt();
					if(QueryType == 1)
					{
						int a = sc.nextInt();
						g.push(a);
					}
					else if(QueryType == 2)
					System.out.print(g.pop()+" ");
				q--;
				}	
				System.out.println();
					
				
				
			t--;
			}
		}
	}

	// } Driver Code Ends



	class Queues
	{
	    Queue<Integer> q1 = new LinkedList<Integer>();
	    Queue<Integer> q2 = new LinkedList<Integer>();
	    
	    //Function to push an element into stack using two queues.
	    void push(int a)
	    {
		    while(!q1.isEmpty()){
		        q2.add(q1.remove());
		    }
		    q1.add(a);
		    while(!q2.isEmpty()){
		        q1.add(q2.remove());
		    }
	    }
	    
	    //Function to pop an element from stack using two queues. 
	    int pop()
	    {
	        if(q1.isEmpty()) return -1;
		    else  return  q1.remove();
	    }
		
	}



