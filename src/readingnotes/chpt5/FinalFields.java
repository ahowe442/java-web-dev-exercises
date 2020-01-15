package readingnotes.chpt5;

//5.1.1 Final Fields

class FortyTwo {

    public int intValue = 42;

}

public class FinalFields {

    public final int intValue = 42;
    //public final double doubleValue;
    public final FortyTwo objectValue = new FortyTwo();

    public FinalFields() {
    }

    public static void main(String[] args) {

        FinalFields demo = new FinalFields();

        // This would result in a compiler error
        //demo.intValue = 6;

        // This is allowed since we haven't initialized doubleValue yet
        //demo.doubleValue = 42.0;

        // However, this would result in a compiler error
        //demo.doubleValue = 6.0;

        // This would result in a compiler error, since we're trying to
        // give objectValue a different object value
        //demo.objectValue = new FortyTwo();

        // However, this is allowed since we're changing a field
        // inside the final object, and not changing which object
        // objectValue refers to
        demo.objectValue.intValue = 6;
    }
}

//5.1.2 Static Fields
//  There are multiple ways to refer to a static field.
//within a class
// Use a static field the same way as a normal, non-static field
//System.out.println("Absolute zero in F is: " + absoluteZeroFahrenheit);
//
//// We can also be more explicit
//System.out.println("Absolute zero in F is: " + this.absoluteZeroFahrenheit);
