public class EcerciseV2 {
    public int perfectSquare(int n) {
        int diff;
        int firstSquare = firstPerfectSquare(n);
        int sum = firstSquare;
        int count = 1;
        while (sum != n) {
            diff = n - sum;
            firstSquare = firstPerfectSquare(diff);
            count++;
            sum += firstSquare;
        }
        return count;
    }

    public static boolean isPerfectSquare(int number) {
        for (int i = 1; i <= number; i++) {
            if (number == i * i) {
                return true;
            }
        }
        return false;
    }

    public int firstPerfectSquare(int number) {
        if (number <= 0) {
            return -1;
        }
        while (number >= 1) {
            if (isPerfectSquare(number)) {
                return number;
            } else {
                number--;
            }
        }
        return number;
    }
}
