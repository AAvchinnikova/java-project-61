package hexlet.code.games;

import hexlet.code.RandomValues;

import java.util.concurrent.ThreadLocalRandom;

public class GameTwo {

    public static String gameTwo(String answer, String resultForUser) {
        int numberOne = ThreadLocalRandom.current().nextInt(100);
        int numberTwo = ThreadLocalRandom.current().nextInt(100);
        int numberToSelect = ThreadLocalRandom.current().nextInt(2);
        String[] calculationSigns = {"+", "-", "*"};
        String sing = calculationSigns[numberToSelect];
        //String calculateNumber = calculation(resultForUser);

        if (answer.isEmpty() & resultForUser.isEmpty()) {
            answer = numberOne + sing + numberTwo;
            return answer;
        } else {
            if (answer.equals(calculation(resultForUser))) {
                System.out.println("Correct!");
                answer = numberOne + sing + numberTwo;
                return answer;
            } else {
                var calculateNumber = GameTwo.calculation(resultForUser);
                System.out.println(answer + " is wrong answer ;(. Correct answer was "
                        + calculateNumber + ".");
                answer = "Wrong";
            }
        }
        return answer;
    }
    public static String calculation (String resultForUser) {
        var mathExample = resultForUser.split("");
        var firstNumber = mathExample[0];
        var secondNumber = mathExample[2];
        String singForCallculate = mathExample[1];
        int result = 0;
        switch (singForCallculate) {
            case "+":
                result = Integer.parseInt(firstNumber)+ Integer.parseInt(secondNumber);
                break;
            case "-":
                result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                break;
            case "*":
                result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                break;
        }
        System.out.println(result);
        return Integer.toString(result);
    }
}