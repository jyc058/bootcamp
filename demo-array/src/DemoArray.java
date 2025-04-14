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

        // writte
        // First box (index)
        arr[0] = 3;
        // Second box
        arr[1] = 4;
        // third box
        arr[2] = -7;

        for (int i = 0; i < arr.length; i++) { // arr.length -> 3 0,1,2 // ! important !!!!!!!!!!!!!!!!!!!!!!
            System.out.println(arr[i]);

        }

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

        // read
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

        // double array, for loop + sysout print out a values
        double[] amounts = new double[6];
        amounts[0] = 10.9;
        amounts[3] = 14.1;
        amounts[5] = 99.9;
        for (int i = 0; i < amounts.length; i++) {
            System.out.println(amounts[i]);
        }

        // add 1.5 to all array value
        for (int i = 0; i < amounts.length; i++) {
            amounts[i] += 1.5;
            System.out.println(amounts[i]);
        }

        // for + if
        // print out those value larger > 100
        for (int i = 0; i < amounts.length; i++) { // or this method if (amounts[i] <= 100) {
                                                   // continue; }
            if (amounts[i] > 100) {
                System.out.println(amounts[i]);
            }
        }

        // int array
        // Find even number, and then print out "Age = x"
        int[] ages = new int[3];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        int evenNum = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] % 2 == 0)
            evenNum = ages[i];
                System.out.println("Age = " + evenNum);
        }

        // array + for + if
        // find the max value in the array
        int[] numbers = new int[6];
        numbers[0] = 0;
        numbers[1] = 20;
        numbers[2] = 35;
        numbers[3] = 48;
        numbers[4] = 50;
        numbers[5] = 69;

        int maxBox = Integer.MIN_VALUE; // ! new things !!!!!!!!!!!!!!!!!!!
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxBox) {
                maxBox = numbers[i];
            }
        }
        System.out.println("Max value=" + maxBox);

        // Find min. value
        int[] salaries = new int[4];
        salaries[0] = 14000;
        salaries[1] = 19000;
        salaries[2] = 21000;
        salaries[3] = 34000;

        int minBox = Integer.MAX_VALUE;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < minBox) {
                minBox = salaries[i];
            }
        }
        System.out.println("Min value=" + minBox);

        // John, Steven, Eric
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Steven";
        names[2] = "Eric";

        // Find the longest name in the array
        String longestName = ""; // !! empty String
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println("The longest name is " + longestName);


        int[] nums = new int[4];
        nums[0] = 9;
        nums[1] = 8;
        nums[2] = 7;
        nums[3] = 10;
        int firstEven = 0;
        // print out the first even number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                firstEven = nums[i];
                System.out.println("The first even number = " + firstEven);
                break;
            }

        }

        char[] directions = new char[5];
        // L -> left
        // r -> right
        directions[0] = 'l';
        directions[1] = 'l';
        directions[2] = 'r';
        directions[3] = 'l';
        directions[4] = 'r';
        // l -> score + 3
        // r -> score - 2
        int score = 0;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == 'l') {
                score += 3;
            }
            if (directions[i] == 'r') {
                score -= 2;
            }
        }
        System.out.println("Total score = " + score);

        // Swapping
        int w1 = 2;
        int w2 = 3;

        int backup = w1;
        w1 = w2;
        w2 = backup;
        System.out.println("w1=" + w1);
        System.out.println("w2=" + w2);

        int[] marksix = new int[6];
        marksix[0] = 5;
        marksix[1] = 20;
        marksix[2] = 47;
        marksix[3] = 43;
        marksix[4] = 39;
        marksix[5] = 2;


        // 5 20 47 43 39 2
        // ! i = 0, j = 0,1,2,3,4 ( marksix[4+1] > marksix)
        // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 47 43 39 3
        // round 2: 20 vs 47 (47 > 20, no swap) -> 5 20 47 43 39 3
        // round 3: 47 vvs 43 (43 < 47, swap) -> 5 20 43 47 39 3
        // round 4: 47 vs 39 (39 < 47, swap) -> 5 20 43 39 47 3

        // ! i = 11
        // ..............
        // Finally -> 2 5 20 39 43 47

        // 2 5 20 39 43 47
        // ! sorting (5 x 5)
        // swapping
        int temp = -1;
        for (int i = 0; i < marksix.length - 1; i++) { // i = 0 ( how many numbers i need to swap)
            for (int j = 0; j < marksix.length - i - 1; j++) { // j = 0,1,2,3,4,5 | j= 0,1,2,3
                if (marksix[j + 1] < marksix[j]) {
                    temp = marksix[j + 1];
                    marksix[j + 1] = marksix[j];
                    marksix[j] = temp;
                }
            }
        }
        for (int i = 0; i < marksix.length; i++) {
            System.out.println(marksix[i]);
        }

        // counting
        int count = 0;
        char[] chs = new char[] {'o', 'p', 'a', 'p'};
        // count the number of 'p'
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == 'p') {
                count++;
            }
        }
        System.out.println("the number of p =" + count);



        char[] chs2 = new char[] {'o', 'p', 'a', 'p', 'o'};
        // 有多少 character， which 數量 > 1 -> o and p
        // 2
        int[] counts = new int[26]; // 0-25
        for (int i = 0; i < chs2.length; i++) {
            counts[chs2[i]- 'a']++;
        }
        int result = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) {
                result++;
            }
        }
        System.out.println(result);
        
        // 0 9 1 9 2 0 9
        // is there any number appear 3 times or more?
        // print out true
        // ! homework
        int[] ns = new int[] {0, 9, 1, 9, 2, 0, 9};
        int[] ct = new int [10]; 
        for (int i = 0; i < ns.length; i++) {
            ct[ns[i]]++;
    }
        boolean found = false;
        for (int i = 0; i < ct.length; i++) {
            if (ct[i] >= 3) {
                found = true;
                break;                
            }
        }
        System.out.println(found);
        

        
        String[] lastNames = new String[] {"Lau", "Wong", "Chan"};
        // 8 primitives + String
    }
}
    


