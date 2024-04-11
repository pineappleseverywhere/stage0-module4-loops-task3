package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numberString = "" + Math.abs(number); // Convert to positive string

        for (int i = 0; i < numberString.length(); i++) {
            sum += numberString.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
