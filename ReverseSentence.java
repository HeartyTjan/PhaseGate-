public class ReverseSentence{


	public static void main(String... args){

		String userSentence = "There is tide in the affairs of men";

		ReverseSentence newReverse = new ReverseSentence();

		newReverse.getSentenceReverse(userSentence);

	}
	
	
	public void getSentenceReverse(String sentence){

		String [] sen = sentence.split(" ");
		int size = sen.length;

		for( int count = sen.length-1; count >= 0 ; count--){
	
				System.out.print(sen[count] + " ");

			
		}

	}

}