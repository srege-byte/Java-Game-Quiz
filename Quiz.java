import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questionList;
    private int userScore;

    public Quiz(List<Question> questionList){
        this.questionList = questionList;
    }

    public void startQuiz(){
        Collections.shuffle(questionList); // Shuffle the question list
        for (Question question : questionList) {
            displayNextQuestion(question);
        }
        calculateScore();
    }

    public void displayNextQuestion(Question question) {
        question.displayQuestion();
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine().trim(); // Trim the user's input
        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
            userScore++;
        } else {
            System.out.println("Incorrect.");
        }
    }

    public void calculateScore(){
        System.out.println("Your score is: " + userScore);
    }
}
