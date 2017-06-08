public int average(int [] numbers) {
	int number = array[0];
   	int counter = 0;
   	int sum = 0;
 
	while (number != 99999) {
       	sum = sum + number;
   	   	counter = counter + 1;
       	number = array[counter];
   	}
 
   	float average = sum/counter;
   	return average;
}
