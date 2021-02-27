package Interview;

public class googleInterview1 {
	public boolean check(String word, String number) {
		boolean checkChar = false;
		if(word.length() != number.length()) {
			return false;
		}
		for(int i = 0; i < word.length(); i++) {
			char wordC = word.charAt(i);
			char numberC = number.charAt(i);
			int[] character = getWord(numberC);
			if(character.length == 0) {
				return false;
			}else {
				checkChar = false;
				for(int j = 0; j < character.length; j++) {
					if(wordC == character[j]) {
						checkChar = true;
						break;
					}
				}
				if(!checkChar) {
					return false;
				}
			}
		}
		return true;
	}
	public int[] getWord(Character c) {
		int[] word;
		switch(c) {
		case '2':
			word = new int[3];
			word[0] = 'a';
			word[1] = 'b';
			word[2] = 'c';
			break;
		case '3':
			word = new int[3];
			word[0] = 'd';
			word[1] = 'e';
			word[2] = 'f';
			break;
		case '4':
			word = new int[3];
			word[0] = 'g';
			word[1] = 'h';
			word[2] = 'i';
			break;
		case '5':
			word = new int[3];
			word[0] = 'j';
			word[1] = 'k';
			word[2] = 'l';
			break;
		case '6':
			word = new int[3];
			word[0] = 'm';
			word[1] = 'n';
			word[2] = 'o';
			break;
		case '7':
			word = new int[4];
			word[0] = 'p';
			word[1] = 'q';
			word[2] = 'r';
			word[3] = 's';
			break;
		case '8':
			word = new int[3];
			word[0] = 't';
			word[1] = 'u';
			word[2] = 'v';
			break;
		case '9':
			word = new int[4];
			word[0] = 'w';
			word[1] = 'x';
			word[2] = 'y';
			word[3] = 'z';
			break;
		default:
			word = new int[0];
		}
		return word;
	}
	public static void main(String[] args) {
		String word = "ce";
		String number = "24";
		
		googleInterview1 gi = new googleInterview1();
		System.out.println("Answer: " + gi.check(word, number));
	}

}
