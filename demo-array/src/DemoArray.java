public class DemoArray {
        public static void main(String[] args) {
            // assign int value 3 into int variable
        int x1 = 3;
        int x2 = 4;
        int x3 = -7;

        // array []
        // right hand side -> creating an array with size 3.
        // left hand side -> assign int array object to int array type(variable)
        int[] arr = new int[3]; // now, we got 3 int boxes able to store 3 int values.

        //writte
        // First box (index)
        arr[0] = 3;
        // Second box
        arr[1] = 4;
        // third box
        arr[2] = -7;

        // Question: int array with size 5.
        // 10, 7, 4, -100, 6
        int[] box = new int[5];
        box[0] = 10;
        box[1] = 7;
        box[2] = 4;
        box[3] = -100;
        box[4] = 6;

        // Question: double array with size 4.
        // assign 4 double value into the array
        double[] arrr = new double[4];
        arrr[0] = 1.1;
        arrr[1] = 2.2;
        arrr[2] = 3.3;
        arrr[3] = 4.4;
        
        //read
        System.out.println(arrr[3]);
        System.out.println(box[3]);
        System.out.println(arr[2]);

        double amount = 99.9;
        arrr[0] = amount; // assign double value into a double variable
        System.out.println(arrr[0]);

        // string array
        // size 3, with 3 string value
        String[] cat = new String[3];
        cat[0] = "white cat";
        cat[1] = "black cat";
        cat[2] = "orange cat";
        



    }
        }
    
        

