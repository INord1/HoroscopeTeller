import java.io.File;
import java.io.FileWriter;
public class WriteToFile {
	public static void writeMessage(int choise,String messageChoise)
	{
		//try block to write in file
		
		try {
			//true statement is using for do not ovveride a file during each while loop 
			//and just append a line
			FileWriter write=new FileWriter("log.txt",true);
			
		
			
			//write.write(messageChoise);
			//if stamenet for choises to append to a file
			if(choise==1||choise==2||choise==3||choise==4
			||choise==5||choise==6||choise==7||choise==8
			||choise==9||choise==10||choise==11||choise==12)
			{
				write.append(messageChoise+"\r"+"\n");
			}
			//else if(choise==2)
			//{
				//write.append(messageChoise+"\r"+"\n");
		//	}
			//exit choise to append nothing
			else if(choise==13){
				write.append(null);
			}
			write.close();
			
		}
		
		catch(Exception e)
		{
			System.out.print("Can no create a file");
		}
		
		
		
	}
	//creating a file
	public static void createF() {
		try {
		 File create=new File("log.txt");
		
		 create.createNewFile();
		 
		 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
}
}
