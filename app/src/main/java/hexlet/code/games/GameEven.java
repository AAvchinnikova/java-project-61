package hexlet.code.games;

import java.util.Random;

public class GameEven {
    public static String gameOne(String answer, String resultForUser) {
        Random random = new Random();
        int number = random.nextInt();
        if (answer.isEmpty() & resultForUser.isEmpty()) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            answer = Integer.toString(number);
            return answer;
        } else {
            if (Integer.parseInt(resultForUser) % 2 == 0 & answer.equals("yes")) {
                answer = Integer.toString(number);
            } else if (Integer.parseInt(resultForUser) % 2 != 0 & answer.equals("no")) {
                answer = Integer.toString(number);
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                answer = "Wrong";
            }
        }
        return answer;
    }
}
