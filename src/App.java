public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    Reader john = new Reader();
    int score = 0;

    int num1 = Methods.randInt(1, 10);
    int num2 = Methods.randInt(1, 10);
    int answer1 = num1 + num2;
    System.out.println("What is " + num1 + "+" + num2 + "?");
    int guess1 = john.getInt("Your guess: ");
        if (guess1 == answer1){
            System.out.println("Correct!");
            score ++ ;
            System.out.println("Your Score = " + score + "/5");
            System.out.println("The correct answer is " + answer1);
        } else {
            System.out.println("Incorrect");
            System.out.println("Your Score = " + score + "/1");
            System.out.println("The correct answer is " + answer1);
        }
    
    int num3 = Methods.randInt(1, 10);
    int num4 = Methods.randInt(1, 10);
    int answer2 = num3 - num4;
    System.out.println("What is " + num3 + "-" + num4 + "?");
    int guess2 = john.getInt("Your guess: ");
        if (guess2 == answer2){
            System.out.println("Correct!");
            score ++ ;
            System.out.println("Your Score = " + score + "/2");
            System.out.println("The correct answer is " + answer2);
        } else {
            System.out.println("Incorrect");
            System.out.println("Your Score = " + score + "/2");
            System.out.println("The correct answer is " + answer2);
        }

    int num5 = Methods.randInt(1, 10);
    int num6 = Methods.randInt(1, 10);
    int answer3 = num5 * num6;
    System.out.println("What is " + num5 + "*" + num6 + "?");
    int guess3 = john.getInt("Your guess: ");
        if (guess3 == answer3){
            System.out.println("Correct!");
            score ++ ;
            System.out.println("Your Score = " + score + "/3");
            System.out.println("The correct answer is " + answer3);
        } else {
            System.out.println("Incorrect");
            System.out.println("Your Score = " + score + "/3");
            System.out.println("The correct answer is " + answer3);
        }

    double num7 = Methods.randInt(1, 10);
    double num8 = Methods.randInt(1, 10);
    Methods.roundDouble(1, num7);
    Methods.roundDouble(1, num8);
    double answer4 = num7 / num8;
    answer4 = Methods.roundDouble(1, answer4);
    System.out.println("What is " + num7 + "/" + num8 + "?");
    double guess4 = john.getDouble("Your guess: ");
    guess4 = Methods.roundDouble(1, guess4);
        if (guess4 == answer4){
            System.out.println("Correct!");
            score ++ ;
            System.out.println("Your Score = " + score + "/4");
            System.out.println("The correct answer is " + answer4);
        } else {
            System.out.println("Incorrect");
            System.out.println("Your Score = " + score + "/4");
            System.out.println("The correct answer is " + answer4);
        }
    
    int num9 = Methods.randInt(1, 10);
    int num10 = Methods.randInt(1, 10);
    int answer5 = num9 % num10;
    System.out.println("What is " + num9 + "%" + num10 + "?");
    int guess5 = john.getInt("Your guess: ");
        if (guess5 == answer5){
            System.out.println("Correct!");
            score ++ ;
            System.out.println("Final Score = " + score + "/5");
            System.out.println("The correct answer is " + answer5);
        } else {
            System.out.println("Incorrect");
            System.out.println("Final Score = " + score + "/5");
            System.out.println("The correct answer is " + answer5);
        }
    }
}
