package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stuff = {"Axlotl","Sunfish","Pinapple","Banane","Finally"};
		
		//2. print the third element in the array
		System.out.println(stuff[2]);
		
		//3. set the third element to a different value
		stuff[2] = "Sawberry";
		
		//4. print the third element again
		System.out.println(stuff[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < fifty.length; i++) {
			fifty[i] = rand.nextInt(51);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small = 51;
		for (int i = 0; i < fifty.length; i++) {
			if (small > fifty[i]) {
				small = fifty[i];
			}
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < fifty.length; i++) {
			System.out.println(fifty[i]);
		}
		//10. print the largest number in the array.
		int large = 51;
		for (int i = 0; i < fifty.length; i++) {
			if (large > fifty[i]) {
				large = fifty[i];
			}
			System.out.println(fifty[i]);
		}
	}
}

