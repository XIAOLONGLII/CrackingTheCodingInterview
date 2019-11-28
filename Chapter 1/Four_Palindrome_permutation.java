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
