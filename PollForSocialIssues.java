import java.util.Scanner;
public class PollForSocialIssues{

	static String [] socialIssues = {"Employment issues", "Corruption issues",
				
				 "Crime rate issues", "electricity issues", "Educational issues"};

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);
		
		int [][] pollResponses = new int [socialIssues.length][10];
		
		int choice = 0;
		while(choice != 12){

			System.out.printf("Rate from 1(least important) to 10(most important)for the social Issues");

			
			for (int row = 0; row < socialIssues.length; row++){

				
				int pollRating = 23;

				while(pollRating >= 1 && pollRating >10){

					System.out.printf("%nRate the %s : " , socialIssues[row]);
					pollRating = receiver.nextInt();

					if(pollRating >=1 && pollRating <=10){

						pollResponses[row][pollRating -1] += 1 ;

					}
					else System.out.print("Invalid option");
				}
			}
		
			System.out.print("Enter 1 to Pass the survey to a friend or 12 to display result : ");

			choice = receiver.nextInt();
			
		}

		outputResponses(pollResponses);
		
	}	


	public static void outputResponses(int[][] pollSummaries){


		System.out.printf("%nSurvey Summary%n");
			
		System.out.printf("%25s", " ");


		for(int count = 0; count < pollSummaries[0].length; count++){
				
			System.out.printf("ratin %d %7s",count+1, " ");

		}


		System.out.print("Average");

			
		for(int row = 0; row < pollSummaries.length ; row++){

			System.out.printf("%n%n%2s", socialIssues[row]);

			for(int column = 0; column <pollSummaries[row].length; column++){

		 			System.out.printf("%12d %2s", pollSummaries[row][column], " "); 
			}
		
			System.out.printf("%15.2f", getAverage(pollSummaries[row]));
		}


		int total = 0;
		int maximumTotal = 0;
		int maximumIssues = 0;
		int minimumTotal = Integer.MAX_VALUE;
		int minimumIssues = 0;

		int count = 0;
		for(int counts = 0; counts < pollSummaries.length; counts++){
		
			for(int counter = 0; counter < pollSummaries[counts].length; counter++){
			
				total +=  pollSummaries[counts][counter];
			}
			
			if(total > maximumTotal){
			
				maximumTotal = total;
				maximumIssues = counts;
			}

			if(total < minimumTotal){
			
				minimumTotal = total;
				minimumIssues = counts;
			}
			
		}
		
		System.out.printf("%n%n%s : %d" , socialIssues[maximumIssues], maximumTotal);
		System.out.printf("%n%n%s : %d" , socialIssues[minimumIssues], minimumTotal);	
	
	}	
	
	public static double getAverage(int [] pollSummaries){


		int totalSum = 0;  
		double average = 0; 
		int count = 0;
		for(int feedback : pollSummaries){

			totalSum += (count + 1) * feedback;
			count++;

			
		 
		}
		average = (double)totalSum / pollSummaries.length; 
			
		return average;
	}
}