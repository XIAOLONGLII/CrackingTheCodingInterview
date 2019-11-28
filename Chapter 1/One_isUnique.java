One_isUnique {
  
  public static void main(String[] args) {
	String s1 = "abcd";
	String s2 = "abcc";
	System.out.println(isUnique(s1));
	System.out.println(isUnique(s2));

}
	//O(n^2)
  private static boolean isUnique(String s){
       // check if a string has all unique characters, can't use addtional datastructure
     for(int i = 0; i < s.length(); i++) {
	 for(int j = i + 1; j < s.length(); j++) {
		if(s.charAt(i) == s.charAt(j)){
		      return false;
		}
	 }
     }
    return true;
  }
}
