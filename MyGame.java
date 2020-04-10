import java.io.*;
import java.util.Random;
class Test1
{
	// Create our objects
		Random rand = new Random();					
		// Initialize constants
		final String ROCK = "rock";
		final String PAPER = "paper";
		final String SCISSORS = "scissors";
		
		String player1Hand = "";
		String player2Hand = "";
		String player3Hand = "";
		String player4Hand = "";
		String roundResult = "player1 selects ''%s'', player2 selects ''%s''\n";
		String scoreMsg = "Player1 Score: %d, player2 Score: %d\n\n";
		int player1Score;
		int player2Score;
		int player3Score;
		int player4Score;
		int score;
		String win="";
		String win2="";
		void read1()
		{
			int temp1Hand = rand.nextInt(3);
			switch (temp1Hand) 
			{
			case 0:
				player1Hand = ROCK;
				break;
			case 1:
				player1Hand = PAPER;
				break;
			case 2:
				player1Hand = SCISSORS;
				break;
			}
			// Randomly generate computer's hand
			int temp2Hand = rand.nextInt(3);
			switch (temp2Hand) 
			{
			case 0:
				player2Hand = ROCK;
				break;
			case 1:
				player2Hand = PAPER;
				break;
			case 2:
				player2Hand = SCISSORS;
				break;
			}
			if (player1Hand.equals(player2Hand))
				read1();
			else
				System.out.format(roundResult, player1Hand, player2Hand);
		}
			
			
		void display1()
		{
			// If not a tie, calculate the winner
				switch (player2Hand)
				{
				case ROCK:
					if (player1Hand.equals(PAPER))
					{
						System.out.format(roundResult, player1Hand, player2Hand);
						System.out.println("Player1 Wins");
						win="player1";
						player1Score++;
						score=player1Score;
						
					}
					else if (player1Hand.equals(SCISSORS))
					{
						
						System.out.format(roundResult, player1Hand, player2Hand);
						System.out.println("Player2 Wins");
						win="player2";
						player2Score++;
						score=player2Score;
						
					}
					break;
					
				case PAPER:
					if (player1Hand.equals(ROCK))
					{
						System.out.format(roundResult, player1Hand, player2Hand);
						System.out.println("Player2 Wins");
						win="player2";
						player2Score++;
						score=player2Score;
						
					}
					else if (player1Hand.equals(SCISSORS))
					{
						System.out.format(roundResult, player1Hand, player2Hand);
						System.out.println("Player1 Wins");
						win="player1";
						player1Score++;
						score=player1Score;
						
					}
					break;
					
				case SCISSORS:
					if (player1Hand.equals(ROCK))
					{
						System.out.format(roundResult, player1Hand, player2Hand);
						System.out.println("Player1 Wins");
						win="player1";
						player1Score++;
						score=player1Score;
						
					}
					else if (player1Hand.equals(PAPER))
					{
						System.out.format(roundResult, player1Hand, player2Hand);
						System.out.println("Player2 Wins");
						win="player2";
						player2Score++;
						score=player2Score;
						
					}
					break;
				}
				// Output the results of the round
				System.out.format(scoreMsg, player1Score, player2Score);
		}
}
class Test2 extends Test1
{
		String roundResult = "player3 selects ''%s'', player4 selects ''%s''\n";
		String scoreMsg = "Player3 Score:%d, player4 Score:%d\n\n";
		Test1 t1=new Test1();
		// This is the main game loop!
		void read2()
		{
			int temp1Hand = rand.nextInt(3);
			switch (temp1Hand) 
			{
			case 0:
				player3Hand = ROCK;
				break;
			case 1:
				player3Hand = PAPER;
				break;
			case 2:
				player3Hand = SCISSORS;
				break;
			}
			// Randomly generate computer's hand
			int temp2Hand = rand.nextInt(3);
			switch (temp2Hand) 
			{
			case 0:
				player4Hand = ROCK;
				break;
			case 1:
				player4Hand = PAPER;
				break;
			case 2:
				player4Hand = SCISSORS;
				break;
			}
			if (player3Hand.equals(player4Hand))
				read2();
			else
				System.out.format(roundResult, player3Hand, player4Hand);
			
			
		}
		public void display2()
		{
			// If not a tie, calculate the winner
				switch (player4Hand)
				{
				case ROCK:
					if (player3Hand.equals(PAPER))
					{
						System.out.format(roundResult, player3Hand, player4Hand);
						System.out.println("Player3 Wins");
						win2="player3";
						player3Score++;
						score=player3Score;
					}
					else if (player3Hand.equals(SCISSORS))
					{
						
						System.out.format(roundResult, player3Hand, player4Hand);
						System.out.println("Player4 Wins");
						win2="player4";
						player4Score++;
						score=player4Score;
					}
					break;
					
				case PAPER:
					if (player3Hand.equals(ROCK))
					{
						System.out.format(roundResult, player3Hand, player4Hand);
						System.out.println("Player4 Wins");
						win2="player4";
						player4Score++;
						score=player4Score;
					}
					else if (player3Hand.equals(SCISSORS))
					{
						System.out.format(roundResult, player3Hand, player4Hand);
						System.out.println("Player3 Wins");
						win2="player3";
						player3Score++;
						score=player3Score;
					}
					break;
					
				case SCISSORS:
					if (player3Hand.equals(ROCK))
					{
						System.out.format(roundResult, player3Hand, player4Hand);
						System.out.println("Player3 Wins");
						win2="player3";
						player3Score++;
						score=player3Score;
					}
					else if (player3Hand.equals(PAPER))
					{
						System.out.format(roundResult, player3Hand, player4Hand);
						System.out.println("Player4 Wins");
						win2="player4";
						player4Score++;
						score=player4Score;
					}
					break;
				}
			// Output the results of the round
			System.out.format(scoreMsg, player3Score, player4Score);
		}
		
}

class Highest extends MyGame
{
	String w1,w2;
	String roundResult = "%s selects ''%s'', %s selects ''%s''\n";
	String scoreMsg = "%s Score: %d, %s Score: %d\n\n";
	String a = "";
	String b = "";
	int cScore;
	int aScore;
	int bScore;
	void hg1(String a,String b)
	{
		w1=a;
		w2=b;
		System.out.println(" Hello ^^^ "+a+" ^^^ Welcome to final round");
		System.out.println(" Hello ^^^ "+b+" ^^^ Welcome to final round");
		int phww;
		String fw1="";
		String fw2="";
		System.out.println("Taking random data of  "+w1+" and "+w2+ "----------------------------------");
		read3(w1,w2);
		display3(w1,w2);
	}
	void read3(String w1,String w2)
	{
			int tmp= rand.nextInt(3);
			switch (tmp) 
			{
			case 0:
				a = ROCK;
				break;
			case 1:
				a = PAPER;
				break;
			case 2:
				a = SCISSORS;
				break;
			}
			// Randomly generate computer's hand
			int tmp2 = rand.nextInt(3);
			switch (tmp2) 
			{
			case 0:
				b = ROCK;
				break;
			case 1:
				b = PAPER;
				break;
			case 2:
				b = SCISSORS;
				break;
			}
			if (a.equals(b))
				read3(w1,w2);
	}
	
		void display3(String w1,String w2)
		{
				// If not a tie, calculate the winner
				switch (b)
				{
				case ROCK:
					if (a.equals(PAPER))
					{
						System.out.format(roundResult,w1,a,w2,b);
						System.out.println(w1+" Wins");
						win=w1;
						aScore++;
						score=aScore;
						
					}
					else if (a.equals(SCISSORS))
					{
						
						System.out.format(roundResult,w1,a,w2,b);
						System.out.println(w2+" Wins");
						win=w2;
						bScore++;
						score=bScore;
						
					}
					break;
					
				case PAPER:
					if (a.equals(ROCK))
					{
						System.out.format(roundResult,w1,a,w2,b);
						System.out.println(w2+" Wins");
						win=w2;
						bScore++;
						score=bScore;
						
					}
					else if (a.equals(SCISSORS))
					{
						System.out.format(roundResult,w1,a,w2,b);
						System.out.println(w1+" Wins");
						win=w1;
						aScore++;
						score=aScore;
						
					}
					break;
					
				case SCISSORS:
					if (a.equals(ROCK))
					{
						System.out.format(roundResult,w1,a,w2,b);
						System.out.println(w1+" Wins");
						win=w1;
						aScore++;
						score=aScore;
						
					}
					else if (a.equals(PAPER))
					{
						System.out.format(roundResult,w1,a,w2,b);
						System.out.println(w2+" Wins");
						win=w2;
						bScore++;
						score=bScore;
						
						
					}
					break;
				}
			
			System.out.format(scoreMsg,w1,aScore,w2,bScore);
		}
}
public class MyGame extends Test2
{
	public static void main(String[] args) throws IOException
	{
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Highest h=new Highest();
		for(int i=1;i<=50;i++)
		{			
			System.out.println("Input \"rock\", \"paper\", or \"scissors:  ");
			System.out.println("**********************************************************");
			System.out.println("In GAME "+i);
			System.out.println("**********************************************************");
			System.out.println(":::::::::::::::::::::::::::::::::::::::::The Round 1 ::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Taking random data of Player 1,2 "+"----------------------------------");
			t1.read1();
			System.out.println("Taking Random data of Player 3,4 "+"----------------------------------");
			t2.read2();
			System.out.println("**********************************************************");
			
			System.out.println("Validating Player 1,2 "+"----------------------------------");
			t1.display1();
			System.out.println("------------------------------------------------------------");
			System.out.println("Validating Player 3,4 "+"----------------------------------");
			t2.display2();
			System.out.println("**********************************************************");
			System.out.println("In Round 1 winners who are Qualified to Round 2:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("The scores and names of 2 winners in Round 1 :!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(t1.win+" score: "+t1.score);
			System.out.println(t2.win2+" score: "+t2.score);
			System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  Let's start the Final Round :@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
			System.out.println(":::::::::::::::::::::::::::::::::::::::::Now in Round 2:::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Now the game between "+t1.win+"  <--V/S-->   "+t2.win2+" Who wins in round 1....");
			h.hg1(t1.win,t2.win2);
			System.out.println("****************************************************************************");
			System.out.println(" Congratulations ! "+h.win+" You are the final winner....... ");
			System.out.println("****************************************************************************");
			//To increment the winner score.
			if(h.win=="player1"){t1.player1Score++;}
			else if(h.win=="player1"){t1.player1Score++;}
			else if(h.win=="player2"){t1.player2Score++;}
			else if(h.win=="player2"){t1.player2Score++;}
			else if(h.win=="player3"){t2.player3Score++;}
			else if(h.win=="player3"){t2.player3Score++;}
			else if(h.win=="player4"){t2.player4Score++;}
			else if(h.win=="player4"){t2.player4Score++;}
			
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The Total NO.Of wins of all players upto 50 rounds the score board::\n==============================================================================\nPlayer 1 won :"+t1.player1Score+" rounds \nPlayer 2 won :"+t1.player2Score+" rounds \nPlayer 3 won :"+t2.player3Score+" rounds \nPlayer 4 won : "+t2.player4Score+" rounds");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Thank you for playing @@@@@@@..............@@@@@@");
		System.out.println("-----------------------------------------------------------------");
	}
}