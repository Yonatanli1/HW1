public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int a = 0, b = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(b);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            int next = a + b;
            a = b;
            b = next;
            if (b % 2 != 0) {
                numOdd++;
            }
        }
        
        
        
        ////////////////////////////////////////////////////////////////
        System.out.println(); // Move to the next line after printing Fibonacci numbers
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
