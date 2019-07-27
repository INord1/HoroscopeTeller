import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		displayMenu.displayM();
		
	
		int uI=input.nextInt();
		
		WriteToFile.createF();
		WriteToFile.writeMessage(uI,UseMenu.menu(uI));
		
		do
		{
			
			
			displayMenu.displayM();
			uI=input.nextInt();
			
			
			WriteToFile.writeMessage(uI,UseMenu.menu(uI));
			
		}while(uI!=13);
	}

}
