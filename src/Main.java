public class Main {

    public static void main(String[] args) {

        // String objects
        /*
        constructing a String
        a String can be created by using a literal or the String class constructor
         */
        String literal = "literal";
        String constructor = "constructor";

        /*
        concatenation
        different Strings can be combined using + or +=
         */
        String first = "Good";
        String second = "Morning";
        String third = first + " " + second + "!"; // Good Morning!

        /*
        implicit conversion of primitive types
        when combining a String with primitive types, the primitive types will be converted to Strings
        Java will read the line from left to right and evaluate
         */
        System.out.println("-----Implicit Conversion of Primitive Types-----");
        System.out.println("4 + \" Hours\": " + 4 + " Hours");                  // 4 is converted to "4" and eventually "4 Hours"
        System.out.println("\"Hours: \" + 4: " + "Hours: " + 4);                // 4 is converted to "4" and eventually "Hours: 4"
        System.out.println("4 + \"4\": " + 4 + "4");                            // 4 is converted to "4" and eventually "44"
        System.out.println("4 + 4 + \"4\": " + 4 + 4 + "4");                    // Reading from left to right, 4 + 4 is evaluated first. Then, 8 is converted to "8" and eventually "84"
        System.out.println("\"4\" + 4 + 4: "  + "4" + 4 + 4);                   // Reading from left to right, everything must be converted to a String to join with "4". Both int 4 are converted to "4" and eventually "444"
        System.out.println("\"4\" + (4 + 4 + 4): " + "4" + (4 + 4 + 4));        // Reading from left to right, everything must be converted to a String to join with "4". (4 + 4 + 4) is evaluated to 12. 12 is converted to "12" and eventually "412"

        /*
        escape sequences
        What if we wanted to write Bob said, "Hello!"
        We need to use escape sequence for certain characters to avoid errors in a String
        To use " in a String, write \"
        To use \ in a String write \\
        To begin a new line in a String write \n
        */
        System.out.println("-----Escape Sequences-----");
        System.out.println("Bob said, \"Hello!\"");            // Bob said, "Hello!"
        System.out.println("This is a backslash: \\");         // This is a backslash: \
        System.out.println("Line 1\nLine 2\nLine 3\nLine 4");  // Text on 4 lines

        // String methods
        // constructor
        /*
        A String can be initialized using a literal or by using the String class constructor
         */
        String sLiteral = "Random";
        String sConstructor = new String("Random");

        // length
        /*
        length() will return the number of characters in the String. Be careful about indexes. Since indexes start at 0, the maximum index is actually length() - 1
         */
        int letters = sLiteral.length();

        // substring
        System.out.println("-----Substrings-----");
        String s1 = "blank space";
        System.out.println("s1: " + s1);
        System.out.println("s1.substring(4, 4): " + s1.substring(4, 4));            // prints a black String

        String s2 = "red apple";
        System.out.println("s2: " + s2);
        System.out.println("s2.substring(0): " + s2.substring(0));       // prints starting at index 0 to the end (whole string)
        System.out.println("s2.substring(4): " + s2.substring(4));       // prints starting at index 4 to the end ("apple")
        System.out.println("s2.substring(0, 4): " + s2.substring(0, 4));            // prints starting at index 0 to 4 - 1 ("red")
        System.out.println("s2.substring(2, 5)" + s2.substring(2, 5));              // prints starting at index 2 to 5 - 1 ("d a")

        // indexOf
        System.out.println("-----Substrings-----");
        String s3 = "blue sky";
        System.out.println("s3: " + s3);
        System.out.println("s3.indexOf(\"lu\"): " + s3.indexOf("lu"));                  // prints 1 because 1 is the index where "lu" starts
        System.out.println("s3.indexOf(\"le\"): " + s3.indexOf("le"));                  // prints -1 because "le" is not found
        System.out.println("s3.indexOf(\"blue sky\"): " + s3.indexOf("blue sky"));      // prints 0 because 0 is the index where "blue sky" starts
        System.out.println("s3.indexOf(\"blue  \"): " + s3.indexOf("blue  "));          // prints -1 because "blue  " is not found

        // equals
        System.out.println("-----.equals(String other)-----");
        String test1 = "Test";
        String test2 = new String("Test");
        System.out.println("test1 == test2: " + test1 == test2);            // prints false because test1 and test2 are not the exact same object in memory
        System.out.println("test1.equals(test2): " + test1.equals(test2));  // prints true because test1 and test2 contain the exact same characters

        String test3 = "tesT";
        String test4 = "test";
        String test5 = "tesT";
        System.out.println("test3: " + test3 + "\ntest4: " + test4 + "\ntest5: " + test5);
        System.out.println("test3.equals(test4): " + test3.equals(test4));                  // prints false because .equals is case sensitive
        System.out.println("test4.equals(test5): " + test4.equals(test5));                  // prints false because .equals is case sensitive
        System.out.println("test3.equals(test5): " + test3.equals(test5));                  // prints true because test3 has the exact same characters as test5

        // compareTo
        System.out.println("-----.compareTo(String other)-----");
        String before = "abc";
        String after = "xyz";
        String extra = "abc";

        System.out.println("before: " + before + "\nafter: " + after + "\nextra: " + extra);
        System.out.println("before.compareTo(after): " + before.compareTo(after));              // prints out a number <0 because "abc" comes alphabetically before "xyz"
        System.out.println("after.compareTo(before): " + after.compareTo(before));              // prints out a number >0 because "xyz" comes alphabetically after "abc"
        System.out.println("before.compareTo(extra): " + before.compareTo(extra));              // prints out 0 because "abc" is not alphabetically before or after "abc"

        // Math class
        System.out.println("-----Math class-----");
        /*
        abs
        returns the absolute value
         */
        System.out.println("-----Math.abs()-----");
        System.out.println("Math.abs(5): " + Math.abs(5));              // prints 5 because 5 is 5 away from 0
        System.out.println("Math.abs(-5): " + Math.abs(-5));            // prints 5 because -5 is 5 away from 0
        System.out.println("Math.abs(28319): " + Math.abs(28319));      // prints 28319 because 28319 is 28319 away from 0
        System.out.println("Math.abs(-28319): " + Math.abs(-28319));    // prints 28319 because -28319 is 28319 away from 0
        System.out.println("Math.abs(9.817): " + Math.abs(9.817));      // prints 9.817 because 9.817 is 9.817 away from 0
        System.out.println("Math.abs(-9.817): " + Math.abs(-9.817));    // prints 9.817 because -9.817 is 9.817 away from 0

        /*
        pow(base, exponent)
        returns base ^ exponent
         */
        System.out.println("-----Math.pow()-----");
        System.out.println("Math.pow(5, 2): " + Math.pow(5, 2));    // prints 5^2 or 25
        System.out.println("Math.pow(5, 3): " + Math.pow(5, 3));    // prints 5^3 or 125
        System.out.println("Math.pow(3, 4): " + Math.pow(3, 4));    // prints 3^4 or 81
        System.out.println("Math.pow(10, 5): " + Math.pow(10, 5));  // prints 10^5 or 100000

        /*
        sqrt
        returns the square root
         */
        System.out.println("-----Math.sqrt()-----");
        System.out.println("Math.sqrt(4): " + Math.sqrt(4));            // prints 2
        System.out.println("Math.sqrt(9): " + Math.sqrt(9));            // prints 3
        System.out.println("Math.sqrt(91.875): " + Math.sqrt(91.875));  // prints square root of 91.875

    }

}