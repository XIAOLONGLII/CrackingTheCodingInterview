class Three_replaceEmpty {
	public static void main(String[] args) {
		
		String s = "I love NYC";
		System.out.println(replace(s));

	}
	private static String replace(String s) {

		StringBuilder sb = new StringBuilder();

		for(char ch: s.toCharArray()) {
			if(ch == ' '){
				sb.append("%20");
			}
			else{
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
