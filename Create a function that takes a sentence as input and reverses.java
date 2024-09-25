import java.util.Scanner;
public class ReverseWords {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence = scanner.nextLine();
String reversedSentence = reverseWords(sentence);
System.out.println("Reversed sentence:");
System.out.println(reversedSentence);
}
private static String reverseWords(String sentence) {
String[] words = sentence.split("\\s+");
StringBuilder reversedSentence = new StringBuilder();
for (int i = words.length - 1; i >= 0; i--) { reversedSentence.append(words[i]).append(" ");
}
return reversedSentence.toString().trim();
}
}
