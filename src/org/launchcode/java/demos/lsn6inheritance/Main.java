package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        System.out.println("7.3 -- A tale of 2 Cats");
        System.out.println("7.3.1 -- Inheriting fields and properties");
        //subclass inherits all non-constructor methods from its base class.
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

        //?????????Why isn't this working??  This should make the cheshire cat tired and hungry and there for the noise
        // should not be the Hello message but instead it should be the Meeooww message.  ???????????





    }
}
