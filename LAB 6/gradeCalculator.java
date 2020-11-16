import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.PrintStream;
public class gradeCalculator {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int midterm;
		int grades[] = new int[4];
		int i;
		float total=0;
		float average;
		PrintStream outputStream = new PrintStream("gradeCalculator.txt");
		System.setOut(outputStream);
		Scanner scanner = new Scanner(System.in);                       
		for(i=0; i<4; i++) { 
			System.out.println("Enter assigned grade "+ (i+1) + ":");
	         grades[i] = scanner.nextInt();
	         total = total + grades[i];
	        }
	        scanner.close();      
	        average = total/4;
	        System.out.print("My grade is: ");
	        if(average>=90 && average<=100)
	        {
	            System.out.print("A");
	        }
	        else if(average>=80 && average<=89)
	        {
	           System.out.print("B");
	        } 
	        else if(average>=70 && average<=79)
	        {
	            System.out.print("C");
	        }
	        else if(average>=60 && average<=69)
	        {
	            System.out.print("D");
	        }
	        else
	        {
	            System.out.print("F");
	        }
	    }
	

	}


