package JavaPlaylist;

public class Skeleton {
    public static void main(String[] args) {  // this is the main method.
        System.out.println("Hello World!");
    }
}

// Blueprint - A blueprint is like a detailed plan or drawing used to build something. In programming, a blueprint is an idea or a guide that tells you how to create an object with specific properties and behaviors.
//Example in Real Life: Imagine an architect’s blueprint for a house. It shows how the house should look, the number of rooms, their sizes, etc. You can build many houses using this same blueprint.

// In Programming (Classes): A class is like a blueprint for creating objects. It defines the properties (like brand, model) and methods (like display()) an object should have. You can use the class to create multiple objects with the same structure.

// Template- A template is a pre-designed structure that you can use to create new items quickly without starting from scratch every time. It's like a mold or a pattern.
// Example in Real Life: Think of a cookie cutter used in baking. The cookie cutter (template) allows you to make many cookies of the same shape.

// In Programming (Classes): A class is also like a template. It lets you create many objects with the same set of properties and methods without writing the same code repeatedly. Those objects will have some state (variables) & some behavior (functions) inside it.

//  "a class is a template," they mean that a class in programming is like a blueprint or a recipe that defines the structure and behavior of objects. A class specifies what properties (data) and methods (functions) the objects created from it will have, but it doesn't create any actual objects by itself. Instead, it provides a template that can be used to create multiple objects with the same structure and behavior.

// object is an instance of the class. Instance is one real object made from a class. When you use "new" keyword, the "JVM" - Allocates memory, Creates a unique copy of the class data, Returns a reference to it, That created thing = instance = object

// what is reference? a reference is when a variable points to the same object in memory rather than holding a copy of the object itself.
// example => If you have a book (an object), a reference is like having a library card that points to where the book is kept in the library. Multiple people (variables) can have a card pointing to the same book.
// If one person changes the content of the book, everyone else with a card pointing to that book will see the changes.

// In java, main method is the entry point of a program. It has a specific signature:
// public: access modifier indicating that the method can be accessed from outside the class.
// static: indicates that the method belongs to the class rather than an instance of the class.
// void: specifies that the method does not return any value.
// main: the name of the method
// String[] args: The method accepts an array of strings as parameters. This is where command-line arguments can be passed to your program.

//System.out.println("Hello World!"); - this line prints the string "Hello World!" to the console. Breakdown:
//System: A class in the java.lang package that provides access to the system, including the console.
//out: An instance of the PrintStream class within the System class, representing the standard output stream

//Standard output stream (stdout): the default stream used by a program to display output to the screen.
//A stream is a continuous flow of data from one place to another: coming into a program (input),  going out of a program (output)

//System.in → input stream
//System.out → output stream

//println(): A method used to print a line of text to the console and send data to that stream
//"Hello world!" - The string to be printed.