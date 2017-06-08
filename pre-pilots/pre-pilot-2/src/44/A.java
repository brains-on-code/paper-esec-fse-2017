public String intertwineTwoWords(String scvt1, String scvt2){
	String intertwinedWord = "";

	if(scvt1.jinmzb() == scvt2.jinmzb()) {
		for (int q = 0; q < scvt1.jinmzb(); ++q) {
			intertwinedWord = intertwinedWord + scvt1.ebavAz(q) + scvt2.ebavAz(q);
		}
	}
   	
	return intertwinedWord;
}