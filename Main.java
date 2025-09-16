// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  static int age = 27; // static methods only work with static variables
  // Numbers with no values gets zero;

  public static void main(String[] args) {
    int age = 30;// this will not affect the static variable

    // Primitive Data types - bypte, short, int, long => ${number}L
    // Decimal DT - aFloat => ${number}F, aDouble
    // Boolean DT - boolean
    // Charecters DT- char - unicode charecters

    char copyrightSymbol = '\u00A9';

    System.out.println("Copyright symbol " + copyrightSymbol);

    // Type conversion -> Implicit (auto) or Explicit conversion
    // Implicit conversion:
    // 1. Int to double is possible but other is not possible

    int number = 5;
    double number2 = number;
    System.out.println("Implicit conversion: " + number2);

    // Explicit conversion:
    double number3 = 5.8;
    int number4 = (int) number3;
    System.out.println("Explicit conversion: " + number4);

    // int / int will always be integer
    // int / double or anything else. result will always be double

    number4 += 7.0;
    System.out.println("Increment: " + number4);

    // Operators: +, -, *, /, %
    // Bitwise not convered
    System.out.println(4 % 3);

    // Pre-increment / Post-Increment
    int number5 = 5;
    System.out.println(number5++);
    System.out.println(++number5);

    // Strings - Literal or Object
    // Literal String same string is checked in memory and returned
    String literalString1 = "Mahith";
    String literalString2 = "Mahith";

    // Object string, new object created regardless stored in memory
    String objectString1 = new String("abc");
    String objectString2 = new String("abc");

    System.out.println(literalString1 == literalString2);
    System.out.println(objectString1 == objectString2);

    // Formatted strings
    // %s - String | %d - Integer | %f - float/double | %b- boolean %c-char
    String name = "Mahith";
    String place = "India";

    String formatedString = String.format(" My Name is %s. I am from %s. I am %d years old", name, place, age);
    System.out.println(formatedString);

    System.out.println(name.length());
    System.out.println(name.isEmpty());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    String s1 = "abc";
    String s2 = "ABC";

    System.out.println(s1.equalsIgnoreCase(s2));
    s1 = s1.replace("bc", "mc");
    System.out.println(s1);

    // String methods => .replace() .contains
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name? ");
    String nameInput = scanner.nextLine();

    // System.out.println("Your name is "+nameInput);
    System.out.printf("Your name is %s ", name);

    System.out.print("How old are you? ");
    int ageInput = scanner.nextInt();
    scanner.nextLine();
    System.out.printf("%d is an excellent age to start programming", ageInput);

    // System.out.printf() // formatted string inside print method
    // System.out.print() // prints curosor in same line
    scanner.close();

    // scanner.nextDouble() scanner.nextFloat()

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}