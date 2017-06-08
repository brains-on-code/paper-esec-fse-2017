public boolean isPalindrome(String word) {
	boolean isPalindrome = true;
   	for (int i = 0, int j = word.length() - 1; i < word.length()/2; i++, j--) {
        if (word.charAt(i) != word.charAt(j)) {
           	isPalindrome = false;
            return isPalindrome;
        }
   	}
   	return isPalindrome;
}
