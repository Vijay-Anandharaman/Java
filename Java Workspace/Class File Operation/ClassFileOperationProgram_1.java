package in.workspace.main;

import java.io.*;

public class ClassFileOperationProgram_1 {

	public static void main(String[] args) throws Exception {
		
        //TODO Auto-generated method stub
       
        PrintWriter pw = new PrintWriter("file3.txt");

        //reading from file1.txt and writing to file3.txt

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
      
        String line = br.readLine();

        while (line!=null)
        {
            //To write all the data to file3.txt
           
            pw.println(line);
            line=br.readLine();
        }
        
        //reading from file2.txt and writing to file3.txt
 
        br = new BufferedReader(new FileReader("file2.txt"));

        line = br.readLine();

        while (line!=null)
        {         
            //To write all the data to file3.txt

            pw.println(line);
            line = br.readLine();
        }
        
        pw.flush();
        br.close();
        pw.close();
        
        System.out.println("Open file3.txt to see the result");
    }
       //JVM shutdown now
}
