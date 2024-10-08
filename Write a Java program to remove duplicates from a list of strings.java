import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        
        System.out.println("Enter strings (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }    
stringList.add(input);
        }
  List<String> uniqueList = removeDuplicates(stringList);
        
        System.out.println("List after removing duplicates:");
        for (String str : uniqueList)
 {
            System.out.println(str);
        }  
scanner.close();
    }  
public static List<String> removeDuplicates(List<String> list) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        
        for (String item : list)
 {
            if (seen.add(item))
 {
                result.add(item);
            } 
       }  
return result;
  }
}
