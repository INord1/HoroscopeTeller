import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class UseMenu {
	public static String menu(int input)
	{   
		int rCount=0;
		String[]textData=new String[20];
	
		int count=0;
		
		try {
			File file=new File("horoscope.txt");
			Scanner readFile=new Scanner(file);
			while(readFile.hasNext())
			{
				textData[count]=readFile.nextLine();
					
				
				count++; 
				
			}
			readFile.close();
			
		}
	
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		
		
		Random randNumbers=new Random();
	
		String choises[]= {"Aries","Taurus","Gemini","Cancer","Leo"
		,"Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius"
		,"Pisces","Exit"};
		
		 
	
	
		if(input==1||input==2||input==3) {
			 rCount=randNumbers.nextInt(4);
			
				System.out.println(textData[rCount]);
			
			
		}
		else if(input==4||input==5||input==6)
		{
			 rCount=randNumbers.nextInt((9-5) + 1) +5;
				
				System.out.println(textData[rCount]);
		}
		else if(input==7||input==8||input==9)
		{
			 rCount=randNumbers.nextInt((14-10) + 1) +10;
				//System.out.print(rCount);
				System.out.println(textData[rCount]);
		}
		else if(input==10||input==11||input==12)
		{
			 rCount=randNumbers.nextInt((19-15) + 1) +15;
			
				System.out.println(textData[rCount]);
		}
				else {
					
			System.exit(0);
				}
			
		

		
	
		
		
	
		return choises[input]+"\t"+textData[rCount];
}
}
