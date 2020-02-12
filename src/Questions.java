import java.util.Scanner;

public class Questions {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		String smallAnimal = "squirrel";
		String bigAnimal = "elephant";
		String smallVegetable = "green bean";
		String bigVegetable = "pumpkin";
		String smallMineral = "apatite";
		String bigMineral = "quartz";
		String answer1 = "";
		String answer2 = "";
		
		
		
		System.out.println("animal, vegetable, or mineral?");
		answer1 = in.next();
		
		System.out.println("is it bigger than your laptop?");
		answer2 = in.next();
		
		
		
		if (answer1.equalsIgnoreCase("animal")) 
		{
			if (answer2.equalsIgnoreCase("yes")) 
			{
				System.out.println("elephant");
			}
			else 
			{
				System.out.println("squirrel");
			}
		}
		
		
		
		
		else if (answer1.equalsIgnoreCase("vegetable")) 
		{
			if (answer2.equalsIgnoreCase("yes")) 
			{
				System.out.println("pumpkin");
			}
			else 
			{
				System.out.println("green bean");
			}
		}
		
		
		
		
		
		
		else if (answer1.equalsIgnoreCase("mineral")) 
		{
			if (answer2.equalsIgnoreCase("yes")) 
			{
				System.out.println("quartz");
			}
			else 
			{
				System.out.println("apatite");
			}
		}
	
	
	
	
	
	
	
	
	}

}
