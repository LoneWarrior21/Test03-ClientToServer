import java.io.*;

public class Client
{
	public static void main(String [] args)
	{
		//Create a txt file name "1.txt"//
		String filename1 = "1.txt";
		
		try
		{
			//assuming default encoding//
			FileWriter fwriter = new FileWriter(filename1);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			
			//P/S: note that write() doesn't automatically append a newline character//
			bwriter.write("5");
			bwriter.newLine();
			bwriter.write("3");
			
			bwriter.close();
		}
		
		catch(IOException ex)
		{
			System.out.println("An error existed to file " + filename1 + "!!!");
		}
	}
}
