package exceptionhandlings;

import java.util.Scanner;

class Min_Balance_Exception extends Exception
{	
	String msg;
	public Min_Balance_Exception(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String toString() {
		
		return msg;
	}
}
public class BankingException {
	static int balance=1000;

	public static void main(String[] args) throws Min_Balance_Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int amount=sc.nextInt();
		try {
			
		
		if(balance<amount)
		{
			throw new Min_Balance_Exception("insufficient balance! your balance is: "+balance);
		}
		else
		{
			System.out.println("plz take money: "+amount);
		}
		}
		catch(Min_Balance_Exception e)
		{
			System.out.println(e);
		}
	}

}
