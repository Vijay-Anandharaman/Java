package in.workspace.main;

import java.io.*;

public class ClassFileOperationProgram_5 {

	public static void main(String[] args) throws Exception {
		
        // TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		String data = br.readLine();
		
		int maxLength = 0;
		
		String result = "";
		
		while(data!=null)
		{
			int resultLength = data.length();
			
			if(maxLength<resultLength)
			{
				maxLength = resultLength;
				result = data;
			}
		    data = br.readLine();
		}

        br.close();
		
		System.out.println("The maxlength string data in a file is :: " + result);
		System.out.println("The maxlength string in a file is :: " + maxLength);
		
	}
        //JVM shutdown now
}
