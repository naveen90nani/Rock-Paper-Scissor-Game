import java.util.*;
class Game
{	
	int a,b;
	String win;
	int A,B,C,D;
	public void incre(String s)
	{
			if(s=="A")
				A++;
			else if(s=="B")
				B++;
			else if(s=="C")
				C++;
			else if(s=="D")
				D++;
	}
	public void rps(String p,String q)
	{
		Random r=new Random();
		a=r.nextInt(3);
		b=r.nextInt(3);
		if(a==0 && b==1){
			System.out.println("Player "+p+"'s choice : Rock \nPlayer "+q+"'s choice : Paper");
			System.out.println("Player "+q+" Won!");
			win=q;
			incre(q);
		}
		else if(a==0 && b==2){
			System.out.println("Player "+p+"'s choice : Rock \nPlayer "+q+"'s choice : Scissor");
			System.out.println("Player "+p+" Won!");
			win=p;
			incre(p);
		}
		else if(a==1 && b==0){
			System.out.println("Player "+p+"'s choice : Paper \nPlayer "+q+"'s choice : Rock");
			System.out.println("Player "+p+" Won!");
			win=p;
			incre(p);
		}
		else if(a==1 && b==2){
			System.out.println("Player "+p+"'s choice : Paper \nPlayer "+q+"'s choice : Scissor");
			System.out.println("Player "+q+" Won!");
			win=q;
			incre(q);
		}
		else if(a==2 && b==0){
			System.out.println("Player "+p+"'s choice : Scissor \nPlayer "+q+"'s choice : Rock");
			System.out.println("Player "+q+" Won!");
			win=q;
			incre(q);
		}	
		else if(a==2 && b==1){
			System.out.println("Player "+p+"'s choice : Scissor \nPlayer "+q+"'s choice : Paper");
			System.out.println("Player "+p+" Won!");
			win=p;
			incre(p);
		}
		else{
			rps(p,q);
		}
	}
}
class RPSGame 
{
	public static void main(String arg[])
	{
		Game g=new Game();
		for(int i=1;i<=2;i++)
		{
			String win1,win2;
			System.out.println("Input \"rock\", \"paper\", or \"scissors:  ");
			System.out.println("**********************************************************");
			System.out.println("In GAME "+i);
			System.out.println("**********************************************************");
			System.out.println(":::::::::::::::::::::::::::::::::::::::::The Round 1 ::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Taking random data of Player A,B "+"----------------------------------");
			g.rps("A","B");
			win1=g.win;
			System.out.println("Winner:"+win1);
			System.out.println("Taking random data of Player C,D "+"----------------------------------");
			g.rps("C","D");
			win2=g.win;
			System.out.println("Winner:"+win2);
			System.out.println(":::::::::::::::::::::::::::::::::::::::::The Round 2::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("Taking random data of Player "+win1+","+win2+"----------------------------------");
			g.rps(win1,win2);
			System.out.println("****************************************************************************");
			System.out.println(" Congratulations ! "+g.win+" You are the final winner....... ");
			System.out.println("****************************************************************************");
			
		}
		System.out.println("****************************************************************************");
		System.out.println("The Total Result Of 50 Rounds :\n===============================\nPlayer A won :"+g.A+" rounds \nPlayer B won :"+g.B+" rounds \nPlayer C won :"+g.C+" rounds \nPlayer D won : "+g.D+" rounds");
		System.out.println("****************************************************************************");
	}
}
			
