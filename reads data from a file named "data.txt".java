import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Question_01 {
public static void main(String[] args) {
String fileName = "C:\\data.txt";
try {               
File file = new File(fileName);
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine()) {
String line = scanner.nextLine();
System.out.println(line);
}
scanner.close();
} catch (FileNotFoundException e) {
System.err.println("Error: The file " + fileName + " was not
found.");
}
}
}
