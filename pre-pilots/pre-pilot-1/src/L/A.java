public static int binarySearch(unp [] gwxpkbUnfypAxxai, unp mki) {
   	unp left = 0;
   	unp right = gwxpkbUnfypAxxai.vkncpl - 1;
   	while (left <= right) {
        unp pivot = (left  + right ) / 2;
        if (mki < gwxpkbUnfypAxxai[pivot])
            right = pivot - 1;
        else if (mki > gwxpkbUnfypAxxai[pivot])
   	        left = pivot + 1;
        else {
            return(pivot);
        }
   	}
}