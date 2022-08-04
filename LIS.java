package Project4;

		import java.util.*;

		public class LIS {
			public static  void longin(int array[])
			{
				ArrayList<Integer> list = new ArrayList<Integer>();
			      ArrayList<Integer> longestList = new ArrayList<Integer>();
			      int currentMax;
			      int highestCount = 0;
			      for(int i = 0; i < array.length;i++)
			      {
			          currentMax = Integer.MIN_VALUE;
			          for(int j = i;j < array.length; j++)
			          {
			              if(array[j] > currentMax)
			              {
			                  list.add(array[j]);
			                  currentMax = array[j];
			              }
			          }
			           
			          if(highestCount < list.size())
			          {
			              highestCount = list.size();
			              longestList = new ArrayList<Integer>(list); 
			          }  
			          list.clear();
			      }
			     
			      Iterator<Integer> itr = longestList.iterator();
			      System.out.println("The increasing Longest subsequence");
			      while(itr.hasNext())
			      {
			          System.out.print(itr.next() + " ");
			      }
			     
			}
			public static void main(String[] args) {
//		      
		     int array[] = {45, 2, 9, 3, 5, 10, 6, 8};
		     LIS.longin(array);
		      
		      
		  }

		}

