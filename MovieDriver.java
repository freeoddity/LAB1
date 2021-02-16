import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Scanner, to get input from user
		Scanner scan = new Scanner (System.in);
		String movTitle; //Declare String object to hold user's movie title
		String movRating; //Declare String object to hold user's movie rating
		int soldTickets; //Declare int data type to hold user's box office/total tickets sold
		Movie m1 = new Movie (); //Initialize new movie object
		int loopCheck = 1; //A int used to check if the loop will be active or not
		String loopAns; //A String object used to check if the user would like to continue or not
		
		
		do
		{
			/*Ask for movie name, get's input from the user and stores it in var movTitle. 
			 Then set's the title as the string object the user input.in the movie object m1 */
			System.out.println("Enter the name of a movie: ");
			movTitle = scan.nextLine();
			m1.setTitle(movTitle);
			
			/*Ask for movie rating, get's input from the user and stores it in var movRating. 
			 Then set's the rating as the string object the user input, in the movie object m1 */
			System.out.println("Enter the rating of the movie: ");
			movRating = scan.nextLine();
			m1.setRating(movRating);
			
			/*Ask for tickets sold, get's input from the user and stores it in var soldTickets. 
			 Then set's the assigns the value as the int the user input to the movie object */
			System.out.println("Enter the amount of tickets sold for this movie: ");
			soldTickets = scan.nextInt();
			m1.setSoldTickets(soldTickets);
			
			
			//Print's all the attributes of the m1 movie object using the toString method within the movie class. 
			System.out.println(m1.toString());
			
			//Ask user if they'd like to enter another movie details if not, it will end the loop printing a parting message.
			System.out.println("Do you want to enter another movie? (y or n)");
			scan.nextLine();
			loopAns = scan.nextLine();
			if (loopAns.equals("n"))
			{
				loopCheck = 0;
			}
			
			
		}while (loopCheck == 1);
	
		
		System.out.println("Good Bye !");

	}

}
