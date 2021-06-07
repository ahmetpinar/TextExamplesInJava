
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class FileOperations {

    
    public static void main(String[] args) throws FileNotFoundException {
        try{
        FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\textExample.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String contentLine;
        while((contentLine = br.readLine()) != null)
        {
            System.out.println(contentLine);
        }
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }   
        
        try{
        // FileWriter writes into text files
        FileWriter fW =new FileWriter ("C:\\Users\\PC\\Desktop\\textExample.txt");           
      BufferedWriter br = new BufferedWriter(fW);	
           
            br.write("Hello Ahmet,");
            br.write(" How are you?");
            br.newLine();
            br.write("This is Java programming.");
           br.close();
       }
        catch (IOException ioe) 
       {
            System.out.println("Error writing to file '" );
       }       
    }  
}
