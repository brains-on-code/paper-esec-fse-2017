public String reverseWord(String originWord) {
	String reversedWord = new String();
 
	for (int i = originWord.length() - 1; i >= 0; i--)
		reversedWord = reversedWord + originWord.charAt(i);
 
	return reversedWord;
}