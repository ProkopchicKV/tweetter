

import java.util.Scanner; 
public class All_tweets implements tweets {
	String filename="F:\\универ\\2курс4сем\\java\\trends\\trends\\data\\all_tweets.txt";
	String x, y;
	int k=6;
	String text,year,hour;
	int i=-1;
	public void perebor()
	{
		 while(i<0){
		System.out.println("Введите нужную строку:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
       if(sc.hasNextInt()) { 
          i = sc.nextInt(); 
          
        }
      
        else  {
          System.out.println("Вы ввели не целое число");
        }}
		
	}
	public void anal()
	{
		File.read(filename, i);
		 int index1=File.s.indexOf(',');	
		x=File.s.substring(1, index1);
		int index2=File.s.indexOf(']');
		y=File.s.substring(index1+2,index2 );
		 year=File.s.substring(index2+4,index2+14 );
		
		hour=File.s.substring(index2+15,index2+23 );
		int index3=File.s.length();
		 text=File.s.substring(index2+24,index3);
		
	}
	
	public void print()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(k);	
		System.out.println(year);		
		System.out.println(hour);
		System.out.println(text);
		
	}
}
