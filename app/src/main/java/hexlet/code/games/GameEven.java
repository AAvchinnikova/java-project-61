package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    private static final int maxNumber = 100;
    public static void gameOne() {
        Engine.meetWithUser("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int number = random.nextInt(maxNumber);
        String questionForUser = Integer.toString(number);
        String answerUser = Engine.playWithUser(questionForUser);
        for (var i = 1; i < 3; i++) {
            var resultcheck = checkNumbers(number, answerUser);
            if (resultcheck) {
                System.out.println("Correct!");
                number = random.nextInt(maxNumber);
                questionForUser = Integer.toString(number);
                answerUser = Engine.playWithUser(questionForUser);
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                Engine.finishGame("Wrong");
                return;
            }
        } Engine.finishGame("");
    }

    public static boolean checkNumbers(int number, String answerUser) {
        boolean resultCheck;
        if (number % 2 == 0 && answerUser.equals("yes") || number % 2 != 0 && answerUser.equals("no")) {
            resultCheck = true;
        } else {
            resultCheck = false;
        }
        return resultCheck;
    }
}
