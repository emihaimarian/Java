public class PrimitiveDataTypes{
    public static void main(String [] args){
        // Width for byte => 8 bits
        // BYTE.MIN_VALUE -126 
        // BYTE.MAX_VALUE +127
        byte b = 127;
        System.out.println("byte b: " + b + "\n");
        
        byte b1 = -128;
        System.out.println("byte b1: " + b1);
        System.out.println("========================================\n");
        
        // Width => 16 bits
        // Wrong syntax char c1 = 'a b';
        char c = 'a';
        System.out.println("char c: " + c + "\n");
        
        // '\u0235' unicode
        char c1 = '\u0235';
        System.out.println("char c1: " + c1);
        System.out.println("========================================\n");
        
        // Width => 16 bits
        // SHORT.MIN_VALUE −32,768 
        // SHORT MAX.VALUE +32,767
        short s = -32768;
        System.out.println("short s: " + s + "\n");
        
        short s1 = 32767;
        System.out.println("short s1: " + s1);
        System.out.println("========================================\n");
        
        // Width => 32 bits
        // INT.MIN_VALUE -2147483648
        // INT.MAX_VALUE 2147483647
        int i = 2147483647;
        System.out.println("integer i: " + i + "\n");
        
        int j = -2147483648;
        System.out.println("integer j: " + j + "\n");
        
        int q1 = 04; 
        System.out.println("integer q1 with 04 value is: " + q1 + "\n");
        
        int q2 = 0xFA;
        System.out.println("integer q2 with 0xFA value is: " + q2 + "\n");
       
        int q3 = 0b101001;
        System.out.println("integer q3 with 0b101001 value is: " + q3);
        System.out.println("========================================\n");
        
        
        // Width => 64 bits
        // Long.MIN_VALUE = -9223372036854775808
        // Long.MAX_VALUE = +9223372036854775807 
        //You can use L or l by number, but I recommend using L to avoid being confused with the number 1
        long l_u = -9223372036854775808L;
        System.out.println("long l_u: " + l_u + "\n");
        
        long l = 9223372036854775807L;
        System.out.println("long l: " + l);
        System.out.println("========================================\n");
        
        // Width => 32 bits
        float f = 10.5f;
        System.out.println("float f: " + f + "\n");
        
        float f1 = 10.5F;
        System.out.println("float f1: " + f1 + "\n");
       
        float f2 = (float) 10.5;
        System.out.println("float f2: " +f2);
        System.out.println("========================================\n");
        
        // Width => 64 bits
        double d = 10.5321;
        System.out.println("double d: " + d + "\n");
        
        double d1 = 10.5321323;
        System.out.println("double d1: " + d1);
        System.out.println("========================================\n");
        
        // Width => 1 bit
        boolean bool = true;
        System.out.println("boolean bool: " + bool + "\n");
        
        boolean bool1 = false;
        System.out.println("boolean bool1: " + bool1);
        System.out.println("========================================\n");
        
        //String type
        String str = "Hello World!";
        System.out.println("string str: " + str);
        System.out.println();
        String str1 = "Hello \n World!";
        System.out.println("string str1: " + str1);
        System.out.println();
        String str2 = "Hello\nWorld!";
        System.out.println("String str2: " + str2);

        
    }
}