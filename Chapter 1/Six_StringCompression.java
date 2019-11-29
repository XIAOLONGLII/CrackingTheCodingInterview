/*
1.6 String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). 
*/

class Six_StringCompression {
	public static void main(String[] args) {
		String s = "aaabbbcccdddeaa";
		System.out.println(compress(s));
		// a5b3c3d3e1
	}
	private static String compress(String s) {

		int[] arr = new int[128];
		StringBuilder sb = new StringBuilder();
		for(char ch: s.toCharArray()) {
			arr[ch-'a']++;
		}

		for(int i = 0; i < 128; i++) {
			if(arr[i] != 0) {
				sb.append((char)(i + 'a'));
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}
}
