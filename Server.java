import java.io.*;

public class Server
{
    public static void main(String [] args)
	{
        //Server read from Client's "1.txt" and write in "1_add.txt"//
        String filename2 = "1.txt";
		String filename3 = "1_add.txt";

        // This will reference one line at a time//
        String line = null;
		String total;
		int val;
		int sum=0;

        try
		{
            FileReader fread = new FileReader(filename2);
			FileWriter fwrite = new FileWriter(filename3);

            BufferedReader bread = new BufferedReader(fread);
			BufferedWriter bwrite = new BufferedWriter(fwrite);

            while((line = bread.readLine()) != null)
			{
                System.out.println(line);
				
				val = Integer.parseInt(line);
				sum = sum + val;
				
            }
			
			System.out.println("total sum of all line is " + sum);
			total = Integer.toString(sum);
			bwrite.write("Total sum of each line is " + total);
			
            //always close files//
            bread.close();
			bwrite.close();
        }
		
        catch(FileNotFoundException ex)
		{
            System.out.println("Unable to open file '" + filename2 + "'");                
        }
        catch(IOException ex)
		{
            System.out.println("Error reading file '" + filename3 + "'");                  
            // Or we could just do this: ex.printStackTrace()//;
        }
    }
}
