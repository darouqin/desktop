import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class MyFileChooser {

	public static void main(String[] args) {
		
		try {
			JFileChooser chooser = new JFileChooser();
			Scanner in = null;
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
				{
				  File selectedFile = chooser.getSelectedFile();
				  in = new Scanner(selectedFile);
						      }
			 } catch (FileNotFoundException e1) {
			    	   e1.printStackTrace();
		      }


	}

}
