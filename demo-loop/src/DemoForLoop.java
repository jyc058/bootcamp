public class DemoForLoop {
    public static void main(String[] args) throws Exception {
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x); // 16

        int a = 2;
        for( int i = 0; i < 3; i++) {
            a *= 2 ;
        }
        System.out.println(a);


        // base = ?, + 8 ( 10 times )

        int num1 = 9;
        int num2 = 17;
        int max = -1;
        if(num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        System.out.println(max);

        
        // 0 - 100, Find the largest odd number, which is < 90
        // for
        int maxOdd = -1;
        for (int i = 0; i < 101; i++) {
            if(i % 2 == 1 && i < 90 && i > maxOdd) {
                maxOdd = i;
            } 
        }
        System.out.println(maxOdd);

        // 0 - 20, sum up all even numbers
        // 0 + 2 + 4...+ 20
        int sumEven = 0;
        for (int i = 0; i < 21; i++) {
            if(i % 2 != 1) {
                sumEven += i;
            }
        }
        System.out.println(sumEven);

        // 0 - 30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
        int box = 0;
        for (int i = 0; i < 31; i++) {
            if (i < 20) {
                if ( i % 2 == 1) {
                    box += i;
                }
            } else {
                if ( i % 2 != 1) {
                    box += i;
                }
            }
                
    }
    System.out.println(box); //250

    // Searching
    String s1 = "welcome to bootcamp.";
    // 1. Find the number of 'o'
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i) == 'o') {
            count++;
        }
    }
    System.out.println(count);


    // Approach 1: simple if
    for(int i = 0; i < 3; i++){
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
    // Approach 2: continue
    for(int i = 0; i < 3; i++){
        if(i % 2 == 1){                 // ! 要fil走的東西
            continue;                  // Skip the rest of code, goes to i++
        }
        if (i > 100) {               // !要fil走的東西
            continue;
        }
        System.out.println(i); // 0,1,2
        }

        // ! for + break
        // Approach 1: simple if
        for(int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.println(i); // 0,1
            }
        }

       // Approach 2: break
       for(int i = 0; i < 3; i++) {
        if (i >= 2) {
            break;                  // Skip the rest of code, goes to i++
        }
        System.out.println(i); // 0,1
      }
        
    
    }

}

