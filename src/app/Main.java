package app;

public class Main {

    static int count = 0;
    static int sum = 0;

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int num:numbers) {

            count++;
            sum += num;
            System.out.println(count + ") Num is " +
                    num + ", sum is " + sum);

        }

        System.out.println("Sum of numbers is " + sum);

    }
}