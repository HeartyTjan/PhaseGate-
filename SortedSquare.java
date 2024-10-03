import java.util.Arrays;
public class SortedSquare{


	public static void main(String... args){

		int [] numbers = {2,1,-7,3,5,9};

		SortedSquare sort = new SortedSquare();

		int [] squareOfArray = sort.getSquareArray(numbers);
		
		sort.getSortedSquare(squareOfArray);

		System.out.printf("Sorted Squared array is : " + Arrays.toString(squareOfArray));


	}
	
	public  void getSortedSquare(int [] array){

		int size = array.length;
		int position;
		int temp;

		for(int count = 0; count < size; count++){

			position = count;

			for (int counter = count + 1; counter < size; counter++){

				if(array[counter] < array[position]){
					
					position = counter;
				}

				
			}
			temp = array[position];
			array[position] = array[count];
			array[count] = temp;
			

		}
		
	}
   
	
	public int[] getSquareArray(int [] array){
	
		int size = array.length;
		int [] square = new int [size];

		int count = 0;
	 	for(int number : array){

			square[count] = getSquare(number);
		
			count++;			
		

		}
		
		return square;

	}
	

	public static int getSquare(int number){

		int numberSquare = 1;  
		for (int count = 1; count <= 2; count++){

			numberSquare *= number; 
			
		}	
		return numberSquare;
	}
	

}