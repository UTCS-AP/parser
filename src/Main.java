import data.*;

import java.util.Scanner;

/**
 * Simple Prefix Calculator
 *
 * Input should be a space delimited arithmetical expression in prefix notation.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nextLine = scan.nextLine();
        while (!nextLine.equals("q")) {
            Expression e = parse(new StringBuilder(nextLine).reverse().toString());
            System.out.println(e + " = " + e.evaluate());
            nextLine = scan.nextLine();
        }
    }

    private static Expression parse(String string) {
        char[] chars = string.trim().replaceAll("\\s+", " ").toCharArray();
        Stack stack = new Stack(string.length());
        int marker = 0;
        while (marker < chars.length) {
            char c = chars[marker];
            if (Character.isDigit(c) ||
                    c == '-' && marker + 1 < chars.length && Character.isDigit(chars[marker + 1])) {
                int count = 0;
                while (chars[marker + count] != ' ' &&
                        marker + count < chars.length)
                    count++;

                stack.push(
                        new Numeric(
                                Integer.parseInt(
                                        new String(chars, marker, count)
                                )
                        )
                );
                marker = marker + count;
            } else {
                switch (c) {
                    case '+':
                        stack.push(new Addition(stack.pop(), stack.pop()));
                        break;
                    case '-':
                        stack.push(new Subtraction(stack.pop(), stack.pop()));
                        break;
                    case '*':
                        stack.push(new Multiplication(stack.pop(), stack.pop()));
                        break;
                    case '/':
                        stack.push(new Division(stack.pop(), stack.pop()));
                        break;
                }
                marker++;
            }
        }
        return stack.pop();
    }
}
