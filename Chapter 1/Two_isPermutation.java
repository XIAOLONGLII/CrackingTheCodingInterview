import java.util.*;
class Two_isPermutation {
	public static void main(String[] args) {
		String s = "abcd";
		String t = "bcda";
		String t1= "zcda";

		System.out.println(isPermutation(s, t));
		System.out.println(isPermutation(s, t1));


		System.out.println(isPermutation2(s, t));
		System.out.println(isPermutation2(s, t1));
	}

	private static boolean isPermutation2(String s, String t) {
		int[] arr = new int[128];
		for(char c: s.toCharArray()) {
			arr[c - '0']++;
		}

		for(char c: t.toCharArray()) {
			arr[c - '0']--;
			if(arr[c - '0'] < 0){
				return false;
			}
		}
		return true;

	}

	private static boolean isPermutation(String s, String t) {
		// a Permutation is re-arrage of letters in one string
		HashMap<Character, Integer> mapOfs = new HashMap<>();

		for(char charInS: s.toCharArray()) {
			if(!mapOfs.containsKey(charInS)) {
				mapOfs.put(charInS, 1);
			}
			else {
				mapOfs.put(charInS, mapOfs.get(charInS) + 1);
			}
		}
		for(char charInT: t.toCharArray()) {
			if(mapOfs.containsKey(charInT)){
				mapOfs.put(charInT, mapOfs.get(charInT) - 1);
			}
		}

		for(int key: mapOfs.values()) {
			if(key != 0){
				return false;
			}
		}
		return true;
	}



}
