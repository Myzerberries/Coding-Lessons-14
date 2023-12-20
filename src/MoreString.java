public class MoreString {
    public static void main(String[] args) {

        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match exactly");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }


        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }



    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

}

//String comparison methods:

//contentEquals - Returns a boolean if the String's value is equal to the value of the argument passed. This method
//allows for arguments other than String, for any type that is a character sequence.

//equals - Return a boolean if the String's value is equal to the value of the argument passed.

//equalsIgnoreCase - Return a boolean if the String's value is equal (ignoring case), to the value of the argument passed.

//contains - Returns a boolean if the String contains the argument passed.

//endsWith, startsWith - These return a boolean, and are much like the contains method, but more specific to the placement
//of the argument in the String.

//regionMatches - Returns a boolean, if defined sub-regions are matched.

//String Manipulation methods:

//The following string methods don't change the underlying meaning of the text value, but perform some kind of clean up:

//indent - This method adds or removes spaces from the beginning of lines in multi-line text.

//strip, stripLeading, stripTrailing, trim - The difference between the strip method and trim method is that the strip()
//supports a larger set of white space characters.

//toLowerCase and toUpperCase - Returns a new String, either in lower case or in upper case.

//The following strings manipulation methods transform the String value, and return a String with a different meaning
//than the original string:

//concat - Similar to the plus operator for strings, it concatenates text to the String and returns a new String as the result.

//join - Allows multiple strings ot be concatenated together in a single method, specifying a delimiter.

//repeat - Returns the String repeated by the number of times specified in the argument.

//replace, replaceAll, replaceFirst - These methods replace characters or strings in teh string, returning a new String
//with replacements made.

//substring, subSequence - These return a part of the String, its range defined by the start and end index specified.
