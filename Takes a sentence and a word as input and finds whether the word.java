import java.util.Scanner;
public class SubstringFinder {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence = scanner.nextLine();
System.out.println("Enter a word to find:");
String word = scanner.nextLine();
boolean isSubstring = sentence.contains(word);
if (isSubstring) {
System.out.println("The word \"" + word + "\" is present in the sentence.");
} else {
System.out.println("The word \"" + word + "\" is not present in the sentence.");
}
}
}
