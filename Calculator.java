package Project1;

import java.util.Scanner;

		final class Calculater{
			public static int  n1,n2;
			private char op;
			public void twoNum(int n1,int n2)
			{
				Calculater.n1=n1;
				Calculater.n2=n2;
			}
			 void  forOption(char a)
			{
				op=a;
				switch(op) //Switch expression  
		         {  
		                
		               case 'A':System.out.println("addition of two number-> "+(n1+n2));
		               break;
		               case 'B':System.out.println("substration of two number->"+(n1-n2));
		               break;
		               case 'C':System.out.println("multiply of two number->"+(n1*n2));
		               break;  
		               case 'D':System.out.println("division of two number -> "+(n1/n2));
		               break;
		                
		               default: System.out.println("Please enter valid input");  
		          }  
			}


			

			
		}

		public class Calculator  {
			
			    public static void main(String[] args) {
			    	int n1,n2;
			    	System.out.println("enter two number for operation");
			    	
			        
			        try (Scanner in = new Scanner(System.in)) {
						n1=in.nextInt();
						n2=in.nextInt();
						System.out.println("enter 1 for addition"+'\n'+"enter 2 for substration"+'\n'+
							"enter 3 for multiply"+'\n'+"enter 4 for division"	);
						int option;
						option=in.nextInt();
						option=option+64;
						char a;
						a=(char)option;
						Calculater obj=new Calculater();
							obj.twoNum(n1, n2);
							obj.forOption(a);
					}
			        
			        
			    }
		}

