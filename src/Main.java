public class Main {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);       //printf is a special print method that takes two arguments-
                                                        //A string and an integer. The %d marks where age will go.

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n",(float)age);

        for(int i = 1; i <= 100000; i *= 10){

            System.out.printf("Printing %6d %n", i);

        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString =  "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }

}

//What is a text block?

//It is simply a String, with a new representation in the source code.

//An escape sequence starts with a backslash. Java has several, but the most common ones are as follows:

// \t Insert a tab character.

// \n Insert a new line character

// \" Insert a double quote character.

// \\ Insert a backslash character.

//At their most complex, format specifiers take the form shown here:

//%[argument_index$][flags][width][.precision]conversion

//They start with a percent sign, and end with a conversion symbol, and have lots of options in between.

//We've looked at one conversion type, d, which is the symbol used for a decimal integer value.

//The String has over 60 methods available.

//The String is a sequence of characters, meaning its characters are ordered and indexed.

//The index starts at 0, and not 1.

//In the example below, we show the indices above each character for the String, "Hello world".

//Index:        H   e   l   l   o       W   o   r   l   d
//Character:    0   1   2   3   4   5   6   7   8   9   10

//This string has a length of 11, but it's last index is 10.

//We can split String's methods up into three basic categories:

//String Inspection Methods: These provide some information about the string, with methods like length(), isEmpty(), and isBlank()

//Methods for comparing String values: These usually return a boolean value (String values are equal or not).

//String manipulation methods: These transform one String value into another.

//The following are String inspection methods:

//length- Returns the number of characters in the String.

//charAt- Returns the character at the index that's passed.

//indexOf/lastIndexOf- Returns an integer, representing the index in the sequence where the String or character passed, can be located in the String

//isEmpty- Returns true if length is zero.

//isBlank- Returns true if length is zero OR the string only contains whitespace characters.

//String vs StringBuilder:

//Because String is immutable, each method call returns a new instance of a String.

//As an alternative, Java provides a mutable class that lets us change its text value, or character sequence.

//This is the StringBuilder Class.

//The preferred way/most efficient way of creating Strings is to assign a literal, or concatenated literals to a variable.

//There are four ways to create a new StringBuilder object, using the new keyword:

//Pass a String.

//Pass no arguments at all.

//Pass an integer value.

//Pass some other type of character sequence (like StringBuilder).