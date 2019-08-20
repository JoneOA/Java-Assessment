package com.qa.javaAssessment;

import java.util.ArrayList;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i < input.length(); i++) {
			word += input.substring(i, i + 1);
			word += input.substring(i, i + 1);
			word += input.substring(i, i + 1);
		}
		return word;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		boolean returnBool = false;
		
		if (a - b == c || a - b == -c) {
			returnBool = true;
		}
		else if (a + b == c) {
			returnBool = true;
		}	
		return returnBool;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		int countIn = (input.length() - a) / 2;
		
		String output = "";
		
		for (int i = 0; i < countIn; i++)
		{
			output = output + input.substring(i, i + 1);
		}
		
		for (int j = countIn + a; j < input.length(); j++) {
			output = output + input.substring(j, j+1);
		}
			
		
		return output;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		
		int counter = 0;//current block
		int finalCounter = 0;//output
		String c = "c";
		
			for (int i = 0; i < input.length(); i++)
			{
				
				if (input.substring(i, i + 1).equals(c)) 
				{
					counter++; //This is when it equals
				}
				else
				{
					c = input.substring(i, i + 1); //set current string to c	
				}
				
				//compare counters
				if (counter > finalCounter) 
				{
					finalCounter = counter;
					counter = 0;
				}
			}
			
		
		return finalCounter;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") ==> 1
	// amISearch("I am in Amsterdam am I?") ==> 2
	// amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) 
	{
		
		String lowerArg = arg1.toLowerCase();
		int counter = 0;
		for (int i = 0; i < lowerArg.length(); i++)
		{
			if (i == 0)
			{
				if (lowerArg.substring(i, i + 2).equals("am") && lowerArg.substring(i+2, i+3).equals(" ")) 
				{
					counter++;
					System.out.println(counter);
				}
			}
			
			else if (i > 0 && i < lowerArg.length() - 3)
			{
				if (lowerArg.substring(i, i + 2).equals("am") && lowerArg.substring(i - 1, i).equals(" ") && lowerArg.substring(i+2, i+3).equals(" "))
				{
				 counter++;
				}
			}
			System.out.println(counter);
		}


		return counter;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) ==> "fizz"
	// fizzBuzz(10) ==> "buzz"
	// fizzBuzz(15) ==> "fizzbuzz"

	public String fizzBuzz(int arg1) {
		String fizzbuzz = "";
		double arg3;
		double arg5;

		for (int i = 1; i <= (arg1 / 3); i++) {
			arg3 = 3 * i;
			arg5 = 5 * i;
			if (arg5 == arg1) 
			{
				fizzbuzz = "buzz" + fizzbuzz;
			}
			else if (arg3 == arg1)
			{
				fizzbuzz = "fizz" + fizzbuzz;
			}
		}
		return fizzbuzz;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") ==> 14
	// largest("15 72 80 164") ==> 11
	// largest("555 72 86 45 10") ==> 15

	
	public int largest(String arg1) {
		// This method splits the string and sums the numbers, trying to split mulitple numbers in the same string
		
		int sum = 0;//what gets returned
		int largestSum = 0;

		for (int j = 0; j < arg1.length(); j++) {
			
			if (arg1.substring(j, j + 1).equals(" ")) 
			{
				sum = 0;
			}
			else
			{
				
				int newNum = Integer.parseInt(arg1.substring(j, j + 1));
				sum += newNum;
				
			}
			
			if (sum > largestSum) {
				largestSum = sum;
			}

			
			
		}

		return largestSum;
	}
	
	
}
