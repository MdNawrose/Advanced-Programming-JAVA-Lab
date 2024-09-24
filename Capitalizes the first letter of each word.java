import java.util.Scanner;
public class Captz {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a sentence:");
String s = scanner.nextLine();
String capSt = captz(s);
System.out.println("Capitalized sentence:");
System.out.println(capSt);
}
private static String captz(String s) {
String[] words = s.split("\\s+");
StringBuilder capSt = new StringBuilder();
for (String word : words) {
if (word.length() > 0)
 {
capSt.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
}
}
return capSt.toString().trim();
}
}
