package Java_Mengran_Li_Devops18_uppgift1;
import java.util.Scanner;

public class RunHiss {

	public static void main(String[] args) {
		
		Hiss hiss1 = new Hiss(0, "hissen_blå");	
		//Hiss hiss2 = new Hiss(-2,"hissen_röd");
		
		Scanner scan = new Scanner(System.in);
		
		boolean no_end = true;
		do {
			System.out.println(hiss1);
			//System.out.println(hiss2);
			
			System.out.println("Please enter the floor you want to go : ");
			int destfloor = (int) scan.nextInt();
			
			hiss1.run(destfloor);
			//hiss2.run(destfloor);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e){} 
			
		}while (no_end);
		
		scan.close();
	 }	
	
}
