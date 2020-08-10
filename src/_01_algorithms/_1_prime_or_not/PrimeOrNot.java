package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Input a number");
		int n = Integer.parseInt(number);
		
		boolean flag = false;
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				flag = true;
				break;
			}
		}
		
		
		if(!flag) {
			System.out.println(n + " is a prime number");
		}
		else {
			System.out.println(n + " is not a prime number");
		}
		
	
	}
}
