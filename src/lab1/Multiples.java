package lab1;

public class Multiples {
   public static void main() {
       int counter = multiples(1000, 3, 5);
       System.out.println(counter);
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        int i = 1;
        while (i < n){
            if (i % a == 0 || i % b ==0){
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
