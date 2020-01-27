package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        System.out.println("7.3 -- A tale of 2 Cats");
        System.out.println("7.3.1 -- Inheriting fields and properties");
        /*
        subclass inherits all non-constructor methods from its base class.
        */
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired()); //Prints True. HouseCat inherits the method eat() from Cat.

        System.out.println("7.3.2 -- Super");
        /*
        When extending a class, we will not be able to create new instances of our subclass
        HouseCat using any constructors provided by Cat.  Cat constructors are not inherited by HouseCat.
        If we want to use a Cat constructor in this subclass, we must explicitly provide it.
        To do so, look at the constructor included in HouseCat:

            public HouseCat(String aName, double aWeight) {
               super(aWeight);
               name = aName;
            }
        */
        System.out.println("7.3.3. @Override");
        /*
        modify behavior provided by the base class
         */


        Cat plainCat = new Cat(8.6);


        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"

        /*
        Similar to other Java Annotations, the @Override annotation is not required. However, it can prevent
        unintentional errors, and makes it clear when reading your code what you intend to do.
         */
        cheshireCat.isSatisfied();
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"
        cheshireCat.isTired();
        cheshireCat.isHungry();
        System.out.println(cheshireCat.noise());

        //TODO: ?????????Why isn't this working??  This should make the cheshire cat tired and hungry and there for the noise
        // should not be the Hello message but instead it should be the Meeooww message.  ???????????

        System.out.println("7.4 - Inheriting From Abstraction");
        System.out.println("7.4.1 - Abstract Classes");
        /*
        Abstraction prevents objects of that type from being created, while still enabling sharing of behavior
        among its subclasses.
        1. Change the signature of the Cat:
        public abstract class Cat
                {
                   // Cat class definition
                }
         */

        Cat salem = new Cat(8);


        /*
        IntelliJ has your back with a handy error message that an abstract class cannot be instantiated.
        In order to use the behavior of an abstract class, we must extend it.
         */

        System.out.println("7.4.2. Abstract Methods");
        System.out.println("An abstract method is a method in an abstract class that does not have a body. " +
                "In other words, it does not have any associated code, only a signature. " +
                "It must also be marked abstract.");

        //public abstract String noise();

        /*
        TODO: Finish reading and notes on casting and testing inheritance!!  These are needed skills for the next assignment.

         */
        System.out.println("7.5. Casting");
        /*
        when you use a base or super class to instantiate the subclass.
         */
        Cat suki = new HouseCat("Suki", 8);
        //calls the noise() method.
        suki.noise();  // prints: Hello, my name is Suki!

        /*
        Results in a compiler error, since Cat
        doesn't have such a method
        */
        //suki.isSatisfied();

        // As long as suki really is a HouseCat, this works
        System.out.println(((HouseCat) suki).isSatisfied());
        ((HouseCat) suki).isSatisfied();
        /*
        The danger here is that if suki is in fact not a HouseCat (it was declared only as a Cat, after all)
        then we’ll experience a runtime exception. A runtime exception is an error that occurs upon
        running the program, and is not found by the compiler beforehand.
        These are dangerous, and situations where they might come up should be avoided.
        So you should only cast an object to another type when you are very sure that it’s safe to do so.
         */

        System.out.println("7.6. Testing Inheritance");






    }
}
