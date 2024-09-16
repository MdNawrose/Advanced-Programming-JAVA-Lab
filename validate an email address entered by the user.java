import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Question
  {
public static void main(String[] args)
    {
Scanner scanner = null;
try
  {
scanner = new Scanner(System.in);
System.out.print("Enter your email address: ");
String email = scanner.nextLine();
validateEmail(email);
System.out.println("Email is valid.");
}
catch (IllegalArgumentException e)
  {
System.err.println("Invalid email format: " + e.getMessage());
} 
catch (NullPointerException e)
  {
System.err.println("Email cannot be null.");
} 
finally
  {
if (scanner != null) 
{
scanner.close();
System.out.println("Scanner closed.");
}
}
}
public static void validateEmail(String email) {
if (email == null)
{
throw new NullPointerException();
}
String emailRegex =
"^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+
\\.)+[a-zA-Z]{2,7}$";
Pattern pattern = Pattern.compile(emailRegex);
Matcher matcher = pattern.matcher(email);
if (!matcher.matches())
{
throw new IllegalArgumentException("Email format is invalid.");
}
}
}
