import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class File {
	static String s = null;
	static String f = null;
	
	public static void read( String filename, int k)
{
 try(BufferedReader br = new BufferedReader(new FileReader(filename)))
 {
   
  
	int i =0;
     while((f=br.readLine())!=null){
                
      if(i==k)  {s =f; break;}
     i++;
     }
     
 }
  catch(IOException ex){
              
     System.out.println(ex.getMessage());
 } 
 
}
	public static void read( String filename, String Array[])
	{
	 try(BufferedReader br = new BufferedReader(new FileReader(filename)))
	 {
	   int i=0;
	     while((Array[i]=br.readLine())!=null){
	      Array[i]=br.readLine();  
	      i++;
	     }
	     System.out.println(i);
	 }
	  catch(IOException ex){
	              
	     System.out.println(ex.getMessage());
	 } 
	 
	}
	

}