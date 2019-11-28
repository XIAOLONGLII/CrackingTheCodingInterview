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
