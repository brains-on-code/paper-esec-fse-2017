public int crossSum(int number) {
	int crossSum= 0;
 
	while (number != 0) {
		crossSum = crossSum + number % 10;
		number = number / 10;
	}
	return crossSum;
}