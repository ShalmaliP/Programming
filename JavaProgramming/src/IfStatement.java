/*
 * Write a program to give grades
 * Grade A for a score of 90% or above
 * Grade B for a score of 80% or above
 * Grade C for a score of 50% or above
 * Grade F for score below 50%
 */


public class IfStatement 
{
	public static void main(String[] args)
	{
		int testScore = 70;
		if (testScore >= 90)
		{
			System.out.println("Grade A");
		}
		else if (testScore >= 80 && testScore < 90)
		{
			System.out.println("Grade B");
		}
		else if (testScore >= 50 && testScore < 80)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Grade F");
		}
	}
}
