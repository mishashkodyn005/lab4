/* Цикл FOR завдання 1 */
public class Main {
    public static void main(String[] args) {
        for (int i = 500; i < 651; i += 10) System.out.println(i);
    }
}


///* Цикл While завдання 1 */
//public class Main {
//    public static void main(String[] args){
//        int i = 500;
//        while (i <= 650){ System.out.println(i); i += 10; }
//    }
//}

///* Цикл DoWhile завдання 1 */
//public class Main {
//    public static void main(String[] args){
//        int i = 500;
//        do {
//            System.out.println(i); i += 10;
//        }while (i <= 650);
//    }
//}



///* Завдання 2 */
//public class Main {
//    public static void main(String[] args){
//        for(int a = 2; a <= 5000; a = 2*a-1){
//            System.out.println(a);
//        }
//    }
//}


///* Завдання 3 */
//public class Main {
//    public static void main(String[] args){
//        for(int i = 1; i <= 10; i++){
//            if(10%i==0) System.out.println(i);
//        }
//    }
//}



///* Завдання 4 for */
//public class Main {
//    public static void main(String[] args){
//        int n = 10, factorial = 1;
//        for(; n != 0; n--){
//            factorial *= n;
//        }
//        System.out.println(factorial);
//    }
//}


///* Завдання 4 while */
//public class Main {
//    public static void main(String[] args){
//        int n = 10, factorial = 1;
//        while (n != 0){
//            factorial *= n--;
//        }
//        System.out.println(factorial);
//    }
//}


///* Завдання 5 */
//public class Main {
//    public static void main(String[] args){
//        int count = 0;
//        for(int i = 1; i <= 1440; i+=1){
//            int h = i / 60, m = i % 60;
//            if ((h % 10 == m / 10) && (m % 10 == h / 10)) count++;
//        }
//        System.out.println(count);
//    }
//}


///* Завдання 6 */
//public class Main {
//    public static void main(String[] args){
//        int count = 0, n = 1;
//        while (n <= 999999){
//            int first_part = (n/100000) + (n/10000%10) + (n/1000%10);
//            int second_part = (n/100%10) + (n/10%10) + n%10;
//            if (first_part == second_part) count++;
//            n++;
//        }
//        System.out.println(count);
//    }
//}

