public int countVowels(String word){
	char [] vowels = {'a','e','i','o','u'};
	int numberOfVowels = 0;

    for (int i = 0; i < word.length(); i++){
       	for (int j = 0; j < vowels.length;j++){
       		if (word.charAt(i) == vowels[j]){
           		numberOfVowels++;
       		}
      	}
   	}

   	return numberOfVowels;
}