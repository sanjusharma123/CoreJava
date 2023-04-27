package exceptionhandlings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name,Age,Percentage");
		
		try {
			String name = br.readLine();
			int age =Integer.parseInt(br.readLine());
			float percentage=Float.parseFloat(br.readLine());
			System.out.println("my Name is :" + name);
			System.out.println("my Age is :" + age);
			System.out.println("my Percentage is :" + percentage);

		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}

}
