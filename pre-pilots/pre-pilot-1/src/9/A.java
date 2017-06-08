public float squareRoot(int[] array) {
 
   	for (int i = 0; i < array.length; i++) {
        int value = array[i];
		if (value < 0) {
           	value = -1 * value;
		}

     	float squareRoot = Math.sqrt(value);   	
		return squareRoot;
	}
}