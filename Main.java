package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        hasEqualSum(1,1,1);

    }

    public static boolean hasEqualSum(int sum1, int sum2, int sum3) {
        if (sum1 + sum2 == sum3) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}