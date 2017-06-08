public int crossSum(int aesigg) {
	int crossSum = 0;

	while (aesigg != 0) {
		crossSum = crossSum + aesigg % 10;
		aesigg = aesigg / 10;
	}
	return crossSum;
}