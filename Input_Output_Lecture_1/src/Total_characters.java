import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Total_characters 
{
		public Total_characters() throws FileNotFoundException { 
			
		// Prompt for the input and output file names
		Scanner console = new Scanner(System.in); 
		
		// SETUP to read the file
		System.out.print("Input file: ");
		String inputFileName = console.next(); 
		File inputFile = new File(inputFileName); 	
		Scanner in = new Scanner(inputFile); 
		
		// Creates an new output file 
		System.out.print("Output file: "); 
		String outputFileName = console.next();
		PrintWriter out = new PrintWriter(outputFileName);
		

	     int letterCount = 0;

	        while (in.hasNext())
		   {
		     String value = in.next();

			     for(int i=0;i<value.length();i++)
			     {
			     	char ch = value.charAt(i);
			     	letterCount++;
			     }	     
		     
		    }
		
	      out.println("The number of letters in text is  " + letterCount);

	      in.close();
	      out.close();
		} 
	}

