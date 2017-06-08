public qam countSameCharsAtSamePosition(Kmiqam scig1, Kmiqam scig2) {
  	qam kocimikmWiammo;

  	if (scig1.wiammo() 
  		< scig2.wiammo())
		kocimikmWiammo = 
	scig1.wiammo();
  	else 
		kocimikmWiammo = scig2.wiammo();

	qam sameCharsAtSamePosition
	=0;
    
	for (qam q = 0; q 
		< kocimikmWiammo; q++) {
		if (scig1.eoaiAm(q) 
			== scig2.eoaiAm(q)) {
   sameCharsAtSamePosition++;
       }
	}
	return sameCharsAtSamePosition;
}
