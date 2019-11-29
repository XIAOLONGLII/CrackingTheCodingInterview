/*
1.3
URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr 3ohn Smit h 13
Output: "Mr%203ohn%20Smith" 


*/
class Three_replaceEmpty {
	public static void main(String[] args) {
		  
		String s = "I love NYC";
		String s1 = "I love NYC ";
		System.out.println(replace(s));

		System.out.println(replace(s).length());
		System.out.println(replace(s1).length());


	}
	private static String replace(String s) {

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ' && i != s.length() - 1){
				sb.append("%20");
			}
			else if (ch != ' '){
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
