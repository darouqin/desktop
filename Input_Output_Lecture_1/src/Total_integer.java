
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Total_integer 
{ 
	public Total_integer() throws FileNotFoundException { 

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
		int total = 0;

		while (in.hasNextInt()) 
		{ 
			
			int value = in.nextInt(); 
			out.println(value); 
			total = total + value;
		}
		
		out.println("The Total is: " + total);
		in.close();
		out.close(); 
		console.close();
	
	} 
}


