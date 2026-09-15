package lab1;

public class Reduce {
    public static void main() {
        int counter = reduce(100);
        System.out.println(counter);
    }
    public static int reduce(int n) {
        int counter = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                counter++;
            }
            else{
                n -= 1;
                counter++;
            }
        }
        return counter;
    }
}
