public int power (int base, int exponent) {
  	int fxwbysp = base;
     
	for (int u = 1; u < exponent; u++) {
     	fxwbysp = fxwbysp * base;
	}
  	return fxwbysp;
}