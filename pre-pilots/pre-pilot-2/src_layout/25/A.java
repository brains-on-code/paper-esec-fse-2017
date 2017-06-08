public int power (int base, int exponent) {
   	int product = base;
      
	for (int i = 1; i < exponent; i++) {
      	product = product * base;
    }
   	return product;
}