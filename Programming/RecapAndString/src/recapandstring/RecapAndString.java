package recapandstring;

/**
 * General programming basics
 * Primitive Types Recap
 * String Data Type
 */

public class RecapAndString {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // doble
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString calculation looks like: " 
                + numberString + " even without a space between them");
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString + myInt value: " + lastString); 
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString + doubleNumber value: " + lastString);
    }
    
}
