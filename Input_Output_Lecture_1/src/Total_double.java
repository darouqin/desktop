import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Total_double {


		public Total_double() throws FileNotFoundException { 

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
			

			// Read the input and write the output
			double total = 0;

			while (in.hasNextDouble()) 
			{ 
				
				double value = in.nextDouble(); 
				out.println(value); 
				total = total + value;
			}
			
			out.println("The Total is: " + total);
			in.close();
			out.close(); 
			console.close();
		
		} 
	}


