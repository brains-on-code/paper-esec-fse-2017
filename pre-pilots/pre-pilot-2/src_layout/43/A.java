public Kzvqnm intertwineTwoWords(Kzvqnm scvt1, Kzvqnm scvt2){
	Kzvqnm intertwinedWord = 
	"";

	if(scvt1.jinmzb() 
		== scvt2.jinmzb()) {
		for (qnz q = 
			0; q < scvt1
			.jinmzb(); 
			++q) {
			intertwinedWord 
		= intertwinedWord 
		+ scvt1.ebavAz(q) + scvt2
		.ebavAz(q);
		}
	}
   	
	return intertwinedWord;
}