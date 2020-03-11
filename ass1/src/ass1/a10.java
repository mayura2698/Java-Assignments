package ass1;

public class a10 {
	public static void reverseByWords(String sentence) { 
		
		String[] words = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    
		   words[i] = words[i].replaceAll("[^\\w]", "");
		   
		}
		
		for (int j = words.length-1; j >=0; j--) {
		
		System.out.print(words[j]+" "); 
		}
	}
	public static void main(String[] args) {
	String Sentence="lol this is really dumb";
	reverseByWords(Sentence);
	}
	}

