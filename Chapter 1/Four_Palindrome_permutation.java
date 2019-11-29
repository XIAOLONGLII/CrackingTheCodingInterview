/*
1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tac t Coa
Output: Tru e (permutations : "tac o cat" , "atc o eta" , etc. ) 

*/
import java.util.*;
class Four_Palindrome_permutation {
	public static void main(String[] args) {
		String s = "tact coa";
		System.out.println(palindromPermutation(s)); // true
	}
	private static boolean palindromPermutation(String s) {
		HashMap<Character, Integer> SMap = new HashMap<>();
		for(char c: s.toCharArray()) {
			if(c != ' '){
				if(!SMap.containsKey(c)) {
				  SMap.put(c, 1);
			        }
				else {
				  SMap.put(c, SMap.get(c) + 1);
				}
			}	
		}
		int count = 0;
		for(int value: SMap.values()) {
			if( value == 1) {
				count++;
			}
		}
		return count == 1;

	}
}
