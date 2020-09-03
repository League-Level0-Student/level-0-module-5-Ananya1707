package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int pet = JOptionPane.showOptionDialog(null, "What kind of pet would you like?", "Choose Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "dog", "cat", "bird" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What activity would you like to do with your pet?", "Choose Activity", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed", "groom", "play" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				foodResponse(pet);
			}
			else if(task == 1) {
				groomResponse(pet);
			}
			else if(task ==2) {
				playResponse(pet);
			}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 30) {
				break;
			}
		}

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void foodResponse (int pet) {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "Chomp Chomp");
			happinessLevel = happinessLevel + 15;
		}
		else if(pet==1) {
			JOptionPane.showMessageDialog(null, "Chomp Chomp");
			happinessLevel = happinessLevel + 5;
		}
		else if(pet==2) {
			JOptionPane.showMessageDialog(null, "Chomp Chomp");
			happinessLevel = happinessLevel + 10;
		}
		
	}
	
	public static void groomResponse (int pet) {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "Bark Bark");
			happinessLevel = happinessLevel + 5;
		}
		else if(pet==1) {
			JOptionPane.showMessageDialog(null, "Meowwwww");
			happinessLevel = happinessLevel + 15;
		}
		else if(pet==2) {
			JOptionPane.showMessageDialog(null, "");
			happinessLevel = happinessLevel + 10;
		}
		
	}
	
	public static void playResponse (int pet) {
		if(pet==0) {
			JOptionPane.showMessageDialog(null, "Woof Woof");
			happinessLevel = happinessLevel + 10;
		}
		else if(pet==1) {
			JOptionPane.showMessageDialog(null, "");
			happinessLevel = happinessLevel + 10;
		}
		else if(pet==2) {
			JOptionPane.showMessageDialog(null, "Chirp Chirp");
			happinessLevel = happinessLevel + 15;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}