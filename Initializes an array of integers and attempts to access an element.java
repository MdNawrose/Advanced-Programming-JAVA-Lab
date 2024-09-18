public class Question_01 {
public static void main(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};
int Index = 10;
try {
int value = numbers[Index];
System.out.println("Value at index " + Index + ": " + value);
    }
catch (ArrayIndexOutOfBoundsException e) {
System.err.println("Error: " + Index + " is beyond the array's
length.");
    }
  }             
}
