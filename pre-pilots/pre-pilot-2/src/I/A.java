public static int binarySearch(int [] sortedInputArray, int key) {
   	int left = 0;
   	int right = sortedInputArray.length - 1;
   	while (left <= right ) {
        int pivot = (left  + right ) / 2;
        if (key < sortedInputArray[pivot])
            right = pivot - 1;
        else if (key > sortedInputArray[pivot])
   	        left = pivot + 1;
        else {
            return(pivot);
        }
   	}
}