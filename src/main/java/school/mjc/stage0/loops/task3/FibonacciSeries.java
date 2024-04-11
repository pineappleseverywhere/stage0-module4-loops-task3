package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int numberOne = 0;
        int numberTwo = 1;
        int numberThree;

        System.out.println(numberOne);
        System.out.println(numberTwo);
        for (int i = 0; i < (lastFibonacci - 2); i++) {
            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
            System.out.println(numberThree);
        }
    }
}
