package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return num1 + " x " + num2 + " = " + num1 * num2;
	}

	public static boolean isPrime(int num) {//Criteria: divisible by only itself and 1
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {//(modulo returns zero if a number is perfectly divisible)
				return false;//returns false if it's divisible by a number greater than 1 and less than itself
			}
		}
		return true;
	}
	
	public static boolean isSquare(int num) {
		for (int i = 1; i <= num; i++) {//If there is a number multiplied by itself equal to this number, it is a prime
			if(i * i == num) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isCube(int num) {
		for (int i = 1; i <= num; i++) {//If there is a number multiplied by itself equal to this number, it is a prime
			if(i * i * i == num) {
				return true;
			}
		}
		return false;
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearlCounter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearlCounter++;
			}
		}
		return pearlCounter;
	}

	public static double findTallest(List<Double> peeps) {
		double max = -1.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > max) {
				max = peeps.get(i);
			}
		}
		return max;
	}

	public static String findLongestWord(List<String> words) {
		int longestWordPosition = 0;
		for (int i = 0; i < words.size(); i++) {
			// System.out.println(words.get(i).length() + ", " +
			// words.get(longestWordPosition).length());
			if (words.get(i).length() > words.get(longestWordPosition).length()) {
				longestWordPosition = i;
			}
		}
		return words.get(longestWordPosition);
	}

	// the Morse code for SOS is "... --- ..."
	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				if (results.get(j) > results.get(j + 1)) {
					// swap elements
					double tempt = results.get(j + 1);
					results.set(j + 1, results.get(j));
					results.set(j, tempt);
				}
			}
		}
		// System.out.println(results);
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequence) {
		for (int i = 0; i < unsortedSequence.size(); i++) {
			for (int j = 0; j < unsortedSequence.size() - 1; j++) {
				if (unsortedSequence.get(j).length() > unsortedSequence.get(j + 1).length()) {
					// swap elements
					String tempt = unsortedSequence.get(j + 1);
					unsortedSequence.set(j + 1, unsortedSequence.get(j));
					unsortedSequence.set(j, tempt);
				}
			}
		}
		return unsortedSequence;// except now it's the sorted sequence :p
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size() - 1; j++) {
				if (words.get(j).compareTo(words.get(j + 1)) > 0) {
					// swap elements
					String tempt = words.get(j + 1);
					words.set(j + 1, words.get(j));
					words.set(j, tempt);
				}
			}
		}
		return words;
	}
}
