import java.util.*;

public class IntegerSumCalculator {
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println("Akshat Srivastava");
        System.out.println("22BCS11740\n");
        List<String> inputs = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> numbers = new ArrayList<>();
        for (String input : inputs) {
            Integer num = parseStringToInteger(input);
            if (num != null) numbers.add(num);
        }
        System.out.println("The sum of the list is: " + calculateSum(numbers));

        inputs = Arrays.asList("100", "200", "300");
        numbers.clear();
        for (String input : inputs) {
            Integer num = parseStringToInteger(input);
            if (num != null) numbers.add(num);
        }
        System.out.println("The sum of the list is: " + calculateSum(numbers));

        inputs = Arrays.asList("50", "invalid", "70");
        numbers.clear();
        for (String input : inputs) {
            Integer num = parseStringToInteger(input);
            if (num != null) numbers.add(num);
        }
        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
