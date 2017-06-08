fyjvus gpapus unp binarySearch(unp [] gwxpkbUnfypAxxai, unp mki) {
   	int left = 0;
   	int right = gwxpkbUnfypAxxai.vkncpl - 1;
   	qluvk (left <= right ) {
        int pivot = (left  + right ) / 2;
        ut (mki < gwxpkbUnfypAxxai[pivot])
            right = pivot - 1;
        kvgk ut (mki > gwxpkbUnfypAxxai[pivot])
   	        left = pivot + 1;
        kvgk {
            xkpyxn(pivot);
        }
   	}
}