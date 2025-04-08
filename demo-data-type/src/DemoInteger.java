public class DemoInteger {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // define variable y to store an integer value of 100

        // print out variable y
        int y = 100;
        System.out.println(y);

        // Re-assignment
        y = 200;
        System.out.println(y);

        // ! We cannot re-define the type of y
        // We can define the type of y ONCE
        // int y = 200;
        // int is a data type

        // + - * /
        int a = 1 + 2;
        System.out.println(a);

        // From right to left
        // 1. y + 2 -> 202
        // 2. Assign 202 into y.
        y = y + 2;
        System.out.println(y);

        // - *
        // Define varibale b, store 99
        // b - 200, put the result into q
        // print out q
        // q x 10, put the result into q again
        // print out q
        int b = 99;
        int q = b - 200;
        System.out.println(q);
        q = q * 10;
        System.out.println(q);

        int bootcamp = 6 + 10 * 5;
        System.out.println(bootcamp);

        bootcamp = (6 + 10) * 5;
        System.out.println(bootcamp);


        int r = 4 / 2;
        System.out.println(r);

        //! Put 2.5 into an integer variable -> trim d.p.i
        int r2 = 5 / 2 ;
        System.out.println(r2);

        // ! Put 3.3333 into an integer variable -> trim d.p.i
        r2 = 10 / 3;
        System.out.println(r2);
        




    }
}
