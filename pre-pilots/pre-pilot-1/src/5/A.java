public int binaryToDecimal (int binaryNumber){
	if (binaryNumber < 0)
		return -1;

	int decimalNumber = 0;
	int tempNumber = binaryNumber;
	int multiplikator = 0;
	for (int i = 0; tmp > 0; i++) {
		multiplikator = tempNumber % 10;
		decimalNumber = decimalNumber + multiplikator * (int) Math.pow((double)2, (double)i);
		tempNumber = tempNumber / 10;
	}
	return decimalNumber ;
}