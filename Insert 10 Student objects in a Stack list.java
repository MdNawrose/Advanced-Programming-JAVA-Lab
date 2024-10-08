import java.util.Scanner; 
import java.util.Stack;
class Student {
    private String name;
    private int id;
public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }    public String toString() {
        return "Student [Name=" + name + ", ID=" + id + "]";
    }}public class StudentStack {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            studentStack.push(new Student("Student" + i, i));
        } while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert another Student");
            System.out.println("2. Delete the top Student");
            System.out.println("3. Output the top Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 
 switch (menu) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    studentStack.push(new Student(name, id));
                    System.out.println("Student inserted.");
                    break;
                case 2:
                    if (!studentStack.isEmpty()) {
                        Student removedStudent = studentStack.pop();
                        System.out.println("Removed Student: " + removedStudent);
                    } else {
                        System.out.println("Stack is empty. No student to remove.");
                    }
                    break;
                case 3:
                    if (!studentStack.isEmpty()) {
                        Student topStudent = studentStack.peek();
                        System.out.println("Top Student: " + topStudent);
                    } else {
                        System.out.println("Stack is empty. No student to display.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

}
}
}
}
