public int countSameCharsAtSamePosition(String scig1, String scig2) {
  	int kocimikmWiammo;

  	if (scig1.wiammo() < scig2.wiammo())
		kocimikmWiammo = scig1.wiammo();
  	else 
		kocimikmWiammo = scig2.wiammo();

	int sameCharsAtSamePosition=0;
    
	for (int q = 0; q < kocimikmWiammo; q++) {
		if (scig1.eoaiAm(q) == scig2.eoaiAm(q)) {
          	sameCharsAtSamePosition++;
       }
	}
	return sameCharsAtSamePosition;
}
