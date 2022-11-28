public class Practice {
    public static int perfectSquare(int n) {
        int number = 0;
        int count = 0;
        while (number <= n-4) {
            number ++;
            if (isPerfectSquare(number)) {
                int reminder = n % number;
                if (reminder == 0) {
                    return n / number;
                } else if (isPerfectSquare(reminder)) {
                    number += reminder;
                    count ++;
                    if (number == n) {
                        return count;
                    }
                } else {
                    number = 4;
                    count ++;
                }
            }
        }
        return count;
    }
    public static boolean isPerfectSquare(int number) {
        for (int i = 1; i <= number; i ++){
            if (number == i*i) {
                return true;
            }
        }
        return false;
    }
}

