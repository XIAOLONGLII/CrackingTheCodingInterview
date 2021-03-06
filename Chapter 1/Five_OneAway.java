/*
1.5 
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale , ple - > true
pales , pale - > true
pale , bale - > tru e
pale , bake - > fals e 

*/

class Five_OneAway {
	public static void main(String[] args) {
		String S1 = "pale";
		String S2 = "bale";
		System.out.println(isOneAway(S1, S2));
	}
	private static boolean isOneAway(String s, String s2) {

		int[] ASCIIArr = new int[26];

		for(char c: s.toCharArray()) {
			ASCIIArr[c - 'a']++;
		}

		for(char c: s2.toCharArray()) {
			ASCIIArr[c - 'a']--;

		}

		int count = 0;
		int countOne = 0;
		int countNegativeOne = 0;
		for(int i: ASCIIArr) {

			System.out.print(i + " ");
			// if( i != 0) {
			// 	count++;
			// }
			if( i == 1) {
				countOne++;
			}
			else if( i == -1) {
				countNegativeOne++;
			}

		}
		System.out.println("count "+count);
		
		return (countOne == 1 ||countNegativeOne == 1 || (countOne == 1 && countNegativeOne == 1)) ;

	}
}
