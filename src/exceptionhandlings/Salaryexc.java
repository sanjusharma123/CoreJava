package exceptionhandlings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Salaryexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
System.out.println("Enter Salary:-");
try {
	int salary=Integer.parseInt(br.readLine());
	System.out.println(salary);
	if(salary>0) {
		System.out.println("salary : "+ salary);
	}
}
catch(Exception e) {
	
}
	}

}
