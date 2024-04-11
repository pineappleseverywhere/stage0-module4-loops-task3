package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        // Handle cases with zero
        if (first == 0) {
            System.out.println(Math.abs(second)); // GCD with 0 is the absolute value of the other number
            return;
        } else if (second == 0) {
            System.out.println(Math.abs(first));
            return;
        }

        // Calculate GCD using Euclidean algorithm for non-zero numbers
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        System.out.println(first);
    }
}
