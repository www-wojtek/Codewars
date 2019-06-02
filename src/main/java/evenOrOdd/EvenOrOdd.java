package evenOrOdd;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(even_or_odd(6));

    }

    public static String even_or_odd(int number) {
        String result;

        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }
}

/*
https://www.codewars.com/kata/even-or-odd/solutions/java/me/best_practice

Description:
Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers
or "Odd" for odd numbers.

 */