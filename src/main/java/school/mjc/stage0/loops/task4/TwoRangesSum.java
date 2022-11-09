package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipSum = 0;
        int count = 0;
        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int i = 0; i <= lastInRow; i++) {
                if(i <= 5) {
                    skipSum += i;
                } else {
                    count += i;
                }
            }
            System.out.println("skipped sum is " + skipSum);
            System.out.println("counted sum is " + count);
        }
    }
}
