public class StringOptions {
    public static void main(String[] args) {

        String helloWorld = "Hello " + "World";
        helloWorld.concat(" and Goodbye");

        //You can't assign a String literal to a StringBuilder variable, so we use a constructor for StringBuilder.
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        //In the above two examples:

        //When we passed the String literal, "and Goodbye", to the concat method, this created an Object in memory for
        //that literal, "and Goodbye".

        //It als created the result of the concat method, the object, the String, that has the value, "Hello World and Goodbye".

        //The code for our concat has a mistake in it, because we didn't assign the result of the method, the concat method,
        //to a variable. It's important to assign the result, of any String manipulation method you call on a String, to a variable.

        //The String referenced by helloWorld variable never changed, instead a new String was created by the method call.

        //In the StringBuilder example, after the call to the append method, we still only have one StringBuilder object.

        //The variable helloWorldBuilder, is still referencing the same object, but the value of that object changed.

        //In this instance, we didn't have to assign teh result to another variable to access the result.

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        //A StringBuilder is mutable, which means it can shrink, or grow, in size.

        //By default, an empty StringBuilder starts out with a capacity of 16, meaning it can contain up to 16 characters,
        //before it needs to request more memory.

        //In the second example, we created a StringBuilder with a starting capacity of 32, which means our sequence can
        //grow up to 32 characters, without needing to request additional allocation.

        //Every time a StringBuilder needs to increase capacity, the data stored in teh original storage needs to get
        //copied over to the larger storage area.


        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }

    public static void printInformation(StringBuilder builder){

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());

    }
}

//String methods vs. StringBuilder methods:

//String methods create a new object in memory, and return a reference to this new object.

//StringBuilder methods return a StringBuilder reference, but it's really a self-reference.

//StringBuilder methods return this self-reference, to support chaining methods together.

//A StringBuilder class has many similar methods to Strings.

//But it also has methods to remove and insert characters or Strings, and truncate it's size.

//delete, deleteCharAt - You can delete a substring using indices to specify a range, or delete a single character at an index

//insert - You can insert text at a specified position.

//reverse - You can reverse the order of the characters in the sequence.

//setLength - setLength can be used to truncate the sequence, or include null sequences to 'fill out' the sequence to that length.
