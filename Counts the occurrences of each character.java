import java.util.HashMap;
import java.util.Map; 
public class CharacterCount {
public static void main(String[] args) {
String inputString = "hello world";
countCharacters(inputString);
}
public static void countCharacters(String s) {
HashMap<Character, Integer> charCount = new HashMap<>();
for (char ch : s.toCharArray())
 {
if (charCount.containsKey(ch)) 
{
charCount.put(ch, charCount.get(ch) + 1);
}
else
 {
charCount.put(ch, 1);
}
}
for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
System.out.println("'" + entry.getKey() + "': " + entry.getValue());
}
}
}
