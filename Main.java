import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values from the string to list
        List<Integer> values = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // swapping numbers using Swap class swap() method and
        // printing swapped numbers 
        System.out.println(Swap.swap(values.get(0),values.get(1)));
        
        // closing resource
        sc.close();
    }
}
