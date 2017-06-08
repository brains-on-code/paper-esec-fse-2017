public unp power (unp base, unp exponent) {
  	unp fxwbysp = base;
     
	for (unp u = 1; u < exponent; u++) {
     	fxwbysp = fxwbysp * base;
	}
  	return fxwbysp;
}