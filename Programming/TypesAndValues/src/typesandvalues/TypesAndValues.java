package typesandvalues;

/**
 * General programming basics
 * Primitive types
 * byte, short, long, int, float, double
 */

public class TypesAndValues {

    public static void main(String[] args) {
        System.out.println("Hello World! My friend.\n");  
                                                //The Law of Nature tells to start
                                                //programming knowledge with
                                                //the Hello World application :)
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //Underflow - if you try to put a smaller value than minimum;
        System.out.println("What if try to decrease Integer Minimum Value (-1) = " + (myMinIntValue - 1)); // becomes MAX
        //Overflow - if you try to put a larger value than maximum;
        System.out.println("What if try to increase Integer Maximum Value (+1) = " + (myMaxIntValue + 1)); // becomes MIN
        //computer just skips back to min/max values
                
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("\nByte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("What if try to decrease Byte Minimum Value (-1) = " + (myMinByteValue - 1)); // becomes MAX
        System.out.println("What if try to increase Byte Maximum Value (+1) = " + (myMaxByteValue + 1)); // becomes MIN
        System.out.println("As you can see, Java changes a type of variable to Integer by default because of difference in MIN/MAX values.");
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("\nShort Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("What if try to decrease Short Minimum Value (-1) = " + (myMinShortValue - 1)); // becomes MAX
        System.out.println("What if try to increase Short Maximum Value (+1) = " + (myMaxShortValue + 1)); // becomes MIN
        System.out.println("As you can see, Java changes a type of variable to Integer by default because of difference in MIN/MAX values.");
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("\nLong Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("What if try to decrease Long Minimum Value (-1) = " + (myMinLongValue - 1)); // becomes MAX
        System.out.println("What if try to increase Long Maximum Value (+1) = " + (myMaxLongValue + 1)); // becomes MIN
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("\nFloat Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);
        System.out.println("What if try to decrease Float Minimum Value (-1) = " + (myMinFloatValue - 1)); // becomes MAX
        System.out.println("What if try to increase Float Maximum Value (+1) = " + (myMaxFloatValue + 1)); // becomes MIN
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nDouble Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);
        System.out.println("What if try to decrease Double Minimum Value (-1) = " + (myMinDoubleValue - 1)); // becomes MAX
        System.out.println("What if try to increase Double Maximum Value (+1) = " + (myMaxDoubleValue + 1)); // becomes MIN
        
        char myChar = 'D'; //2 bytes allows us to use UNICODE, 65535 types of characters
        char myUnicodeChar = '\u0040'; // usage of Unicode @
        char myUnicodeChar1 = '\u00A9'; // usage of Unicode C
        System.out.println("\nUsage of Unicode: " + myUnicodeChar);
        System.out.println("Usage of Unicode: " + myUnicodeChar1 + "\n");
                
    }
    
}
