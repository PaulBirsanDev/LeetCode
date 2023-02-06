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


    // In an apartment complex there are buildings with different floor numbers.
    // You are given an array with the number of floors in each building. Determine
    // how many buildings are the tallest.

    public static int tallestBuildings(int[] floors) {
        int count = 1;
        int firstIndex = floors[0];
        for (int i = 1; i < floors.length; i++) {
            if (floors[i] > firstIndex) {
                firstIndex = floors[i];
                count = 1;
            } else if (floors[i] == firstIndex) {
                count ++;
            }
        }
        return count;
    }

//    We have the rock, paper, and scissors game. Write an algorithm which solves the problem and tells
//    who the winner is, knowing that you have 2 players that are playing. When building the algorithm, take
//    into consideration that this can be extended with new possibilities.
    public static String game(String p1Choice, String p2Choice) {
        String[] p1Wins = {"paper,rock", "rock,scissors", "scissors,paper", "newElement,paper"};
        String concat = p1Choice + "," + p2Choice;
        concat.toLowerCase();
        for (String p1 : p1Wins) {
            if (p1.equals(concat)) {
                return "Player 1 won";
            }

        }
        return "Player 2 won";
    }

}