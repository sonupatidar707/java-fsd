package Project3;

		import java.io.*;
		import java.util.*;

		public class Read_write_append {
			/**
			 * @throws IOException
			 */
			public static void createAndWrite() throws IOException
			{
				//create file
				File file= new File("D:\\fileHanding\\Demo.txt");
				
				if(file.createNewFile()) {
					System.out.println("File is created");
				}
				else {
					System.out.println("File  is already Exist");
				}
				
				//write data to that file
				FileWriter  writer= new  FileWriter(file,false);//overWrites file
				//FileWriter  writer= new  FileWriter(file,true);//appends File
				System.out.println("write the text");
				try (Scanner ob2 = new Scanner(System.in).useDelimiter("\n")) {
					String s=ob2.next();
					
					writer.write(s);
				}
				writer.close();
				
				
			}
			
			
			public static void readFile() throws IOException
			{ 
				try (FileReader reader = new FileReader("D:\\fileHanding\\Demo.txt")) {
					int data;
					
					while((data=reader.read())!=-1){
						
						System.out.print((char)data);
					}
				}
				
			}
			
			
			public static void appendFile(String fileName,
		            String str) {
				
				 try {
					 
			            // object of BufferedWriter class
			            BufferedWriter out = new BufferedWriter(
			                new FileWriter(fileName, true));
			 
			            // Writing
			            out.write(str);
			            out.close();
			        }
			 
			        //  exceptions
			        catch (IOException e) {
			 
			            //  when exception occurs
			            System.out.println("exception occurred" + e);
			        }
				
				
			}

			
			public static void main(String[] args) {
				System.out.println("enter your option:"+'\n'+"1->Enter 1 for write the file"+'\n'+"2->Enter 2 for read in the file"+'\n'+"3->Enter 3 for append text");
				@SuppressWarnings("resource")
				Scanner ob=new Scanner(System.in);
				int n=ob.nextInt();
				if(n==1)
				{
					try {
					 createAndWrite();
					 
					} catch (IOException e) {
					e.printStackTrace();
					}
				
				}
				
				if(n==2)
				{
				
					try {
					readFile();
					} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("File not available");
					}
				}
				if(n==3)
				{
					@SuppressWarnings("resource")
					Scanner ob1=new Scanner(System.in).useDelimiter("\n");
					String str="D:\\fileHanding\\Demo.txt";
					System.out.println("Enter the text that you want to append");
					
					String appendtext=ob1.next();;
					
					appendFile(str,appendtext);
					System.out.println("After append the file ->");
				
					try {
					readFile();
					} catch (IOException e) {
					
					System.out.println("File not available");
					}
				}
				
			}
			

		}

