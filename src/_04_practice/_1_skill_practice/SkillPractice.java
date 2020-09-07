package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}
	
	void skill1() {
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int numOfDimes = Integer.parseInt(dimes);
		double cents = numOfDimes * 10;
		JOptionPane.showMessageDialog(null, "You have " + cents + " cents.");
		
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int heightAsInt = Integer.parseInt(height);
		if(heightAsInt <= 36) {
			JOptionPane.showMessageDialog(null, "You need to eat your Wheaties");
		}	
	}
	
	void skill2() {
		for (int i = 1; i < 31; i++) {
			if(i%3==0) {
			System.out.println(i);
			}
			
		}
	}
	
	void skill3() {
		Random random = new Random();
		
		int randomNum1 = random.nextInt(20);
		System.out.println("Random Number 1" + randomNum1);
		int randomNum2 = random.nextInt(10);
		System.out.println("Random Number 2" + randomNum2);
		
		int difference = randomNum1 - randomNum2;
		
		JOptionPane.showMessageDialog(null, "The difference between two random number is " + difference);
		
	}
	
	void skill4() {
		String city = JOptionPane.showInputDialog("Which city do you live in?");
		if(city.equalsIgnoreCase("san deigo")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city");
		}
		else{
			JOptionPane.showMessageDialog(null, "You should move to San Diego");	
		}
		
		int car = 2;
		int wheels = car * 4;
		JOptionPane.showMessageDialog(null, "I have " + car + " cars with " + wheels + " wheels");			
	}
	
	void skill5() {
		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school");			
	}


}
