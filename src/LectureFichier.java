
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JLabel;

		public class LectureFichier {

			public static void main(String[] args){
		    	Reponse R = new Reponse();
		    	Scanner sc = new Scanner(System.in);
		    	BufferedReader br = null;
		    	try{
		    		br = new BufferedReader(new FileReader("testRead.txt"));
		    		String line;
		    		while((line = br.readLine()) != null){
		    			System.out.println(line);
		    		}		    	}
		    	catch(IOException e){
		    		System.out.println("Could not find file");
		    		e.printStackTrace();
		    	}
		    	finally{
		    		try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    	R.LesReponse();
		    }
	}

