package NumberGuissing;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Numberguissing {

	public static void main(String[] args) {
		  
				int myNumber=(int)(Math.random()*100);
				int userNumber;
				System.out.println();
				System.out.println("****WELCOME TO NUMBER GUESSING GAME****");
				System.out.println();
				Scanner sc=new Scanner(System.in);
				System.out.println("GUESS MY NUMBER BETWEEN 1-100 PLEASE!!!!!!");
				String str=JOptionPane.showInputDialog("Enter a whole number between 1 and 100");
			    System.out.println();
				do{
					userNumber=sc.nextInt();
					System.out.println();
					if(userNumber == myNumber)
					{
					   System.out.println("HOOHOO!!! ENTERED NUMBER IS SAME!!! YOU WIN!!! CONGRATULATIONS!!!");
					   System.out.println();
					}
					else if(userNumber < myNumber)
					{
						
					   System.out.println("OOOHH NO!!! ENTERED NUMBER IS SMALL!!! GUESS AGAIN!!! ");
					   System.out.println();
					}
					else
					{
					   System.out.println("OOOHH NO!!! ENTERED NUMBER IS BIG!!! GUESS AGAIN!!! ");
					   System.out.println();
					}
				}while(userNumber>0);
				
				System.out.println("ITS OKAY...MY NUMBER WAS "+ myNumber + " THANK YOU!!!");
			}
		}

	

