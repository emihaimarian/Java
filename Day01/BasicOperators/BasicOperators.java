public class BasicOperators{
    public static void main(String [] args){
        // Aritmetic Operators
        // 1. Addition (+)
        System.out.println("Addition and String concatenation using + sign\n");
        int x = 5 + 4;
        System.out.println("x = " + x + "\n");
        
        // String concatenation Java
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println(s1 + s2 + "\n");
        
        String s3 = "Hello";
        s3 = s3 + "World!";
        System.out.println(s3 + "\n");
        
        String s4 = "Hello";
        String s5 = "World!";
        String s6 = s4 + " " + s5;
        System.out.println(s6 + "\n");
        
        String s7 = "Hello";
        String s8 = "World!";
        System.out.println(s7 + " " + s8);
        System.out.println("========================================\n");
        
        // 2. Substraction (-)
        System.out.println("Substraction using - sign\n");

        int y = 5 - 4;
        System.out.println("y = " + y);
        System.out.println("========================================\n");
        
        // 3. Multiplication (*)
        System.out.println("Multiplication using * sing\n");

        int z = (2 + 4) * 3;
        System.out.println("z = " + z);
        System.out.println("========================================\n");
        
        // 4. Division (/)
        System.out.println("Division using / sign\n");

        int c = (2 + 4) / 3;
        System.out.println("c = " + c + "\n");

        int c1 = (2 + 4) / 2;
        System.out.println("c1 = " + c1);
        System.out.println("========================================\n");
        
        
        // 5. Modulus (%)
        System.out.println("Modulus using % sign\n");
        int v = (2 + 10) % 5;
        System.out.println("v = " + v + "\n");
        
        int v1 = (2 + 10) % 3;
        System.out.println("v1 = " + v1);
        System.out.println("========================================\n");
        
        // 6. Increment (++)
        System.out.println("Post-Increment\n");
        int a = 10;
        System.out.println("Value of int a before post-increment: " + a + "\n");
        a++;
        System.out.println("Value of int a after post increment: " + a + "\n");
        
        System.out.println("Pre-Increment\n");
        int b = 20;
        System.out.println("Value of int b before pre increment: " + b + "\n");
        ++b;
        System.out.println("Value of int b after pre increment: " + b);
        System.out.println("========================================\n");
        
        // 7. Decrement (++)
        System.out.println("Post-Decrement\n");
        int e = 10;
        System.out.println("Value of int a before post-decrement: " + e + "\n");
        e--;
        System.out.println("Value of int a after post-decrement: " + e + "\n");
        
        System.out.println("Pre-Decrement\n");
        int f = 20;
        System.out.println("Value of int b before pre-decrement: " + f + "\n");
        --f;
        System.out.println("Value of int b after pre-decrement: " + f);
        System.out.println("========================================\n");
        
        System.out.println("Better understanding: Increment and Decrement");
        int nr1 = 5;
        int nr2 = 3;
        System.out.print("nr1 = " + nr1 + " ");
        System.out.print("nr2 = " + nr2);
        System.out.println();
        
        //nr3 is set to 15
        int nr3 = nr2 * nr1++;
        System.out.println("nr3 = nr2 * nr1++ = " + nr3 + "\n");
        
        //nr4 is set to 21
        int nr4 = nr2 * ++nr1;
        System.out.println("nr4 = nr2 * ++nr1 = " + nr4 + "\n");
        
        //nr5 is set to 45
        int nr5 = nr2 * nr3--;
        System.out.println("nr5 = nr2 * nr1++ = " + nr5 + "\n");
        
        //nr6 is set to 39
        int nr6 = nr2 * --nr3;
        System.out.println("nr6 = nr2 * nr1++ = " + nr6 + "\n");    
    }
}