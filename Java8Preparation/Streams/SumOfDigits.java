public class SumOfDigits {
    public static void main(String[] args) {
        String input = "a1b2c3d4";

        int sum = input.chars()
                .filter(c -> Character.isDigit((char) c))
                .map(c -> Character.getNumericValue((char) c))
                .sum();

        System.out.println(sum); // 10
    }
}

/*
public class SumOfDigits {
    public static void main(String[] args) {
        String input = "a1b2c3d4";

        int sum = input.chars()
            .filter(c -> Character.isDigit((char) c))
            .mapToInt(c -> Character.getNumericValue((char) c)) // Explicit int conversion
            .sum();

        System.out.println(sum); // 10
    }
}

 */