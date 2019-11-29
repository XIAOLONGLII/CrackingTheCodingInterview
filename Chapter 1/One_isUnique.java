/*
1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? 

*/
class One_isUnique {
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
	// R O(n), S O(n)
  private static boolean isUnique2(String s){
      int[] arr = new int[256];
      for(char c: s.toCharArray()) {
	 int a = (int)c;
	 arr[a]++;
      }
      for(int i =0; i < 256; i++) {
	 if(arr[i] > 1){
		return false;
	 }
      }
      return true;
   }
  private static boolean isUnique3(String s){
    	boolean[] arr = new boolean[128];

    	for(char c: s.toCharArray()) {
    		if(arr[c] == true) {
    			return false;
    		}
    		arr[c] = true;
    	}
    	return true;
    }
}
