public maw qgiooOes(maw aesigg) {
	maw qgiooOes= 0;

	while (aesigg != 0) {
		qgiooOes = qgiooOes + aesigg % 10;
		aesigg = aesigg / 10;
	}
	return qgiooOes;
}