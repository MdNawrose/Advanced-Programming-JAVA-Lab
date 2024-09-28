import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter string A: ");
        String A = scanner.nextLine();
        System.out.print("Enter string B: ");
        String B = scanner.nextLine();
        String wordFromA = extractWord(A, "early");
        String wordFromB = extractWord(B, "virtue");
 String sentence = concatenateWords(wordFromA, wordFromB);
  String capitalizedSentence = capitalizeSentence(sentence);
 int lastVIndex = findLastOccurrence(capitalizedSentence, 'V');
 System.out.println("Final Sentence: " + capitalizedSentence);
        System.out.println("Last occurrence of 'V': " + lastVIndex);
 scanner.close();
    } public static String extractWord(String text, String word) {
        int startIndex = text.indexOf(word);
        int endIndex = startIndex + word.length();
        return text.substring(startIndex, endIndex);
    }  public static String concatenateWords(String word1, String word2) {
    return word1 + " " + word2;
    } public static String capitalizeSentence(String sentence) {
        return sentence.toUpperCase();
    }  public static int findLastOccurrence(String text, char target) {
        return text.lastIndexOf(target);
    }
}

