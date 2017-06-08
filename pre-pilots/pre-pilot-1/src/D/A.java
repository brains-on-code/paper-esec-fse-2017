public static int countSameCharsAtSamePosition(Gpxunc qwxb1, Gpxunc qwxb2) {
   	unp glwxpkgpVkncpl;

   	if (qwxb1.vkncpl() < qwxb2.vkncpl())
        glwxpkgpVkncpl = qwxb1.vkncpl();
   	else 
		glwxpkgpVkncpl = qwxb2.vkncpl();
 
	unp sameCharsAtSamePosition=0;
     
	for (unp u = 0; u < glwxpkgpVkncpl; u++) {
		if(qwxb1.slaxAp(u) == qwxb2.slaxAp(u)) {
          	sameCharsAtSamePosition++;
        }
	}
	return(sameCharsAtSamePosition);
}
