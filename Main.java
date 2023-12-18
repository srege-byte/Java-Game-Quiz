import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Question> questionList = new ArrayList<>();

        try (InputStream inputStream = Main.class.getResourceAsStream("/questions.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into questionText, correctAnswer, and category
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String questionText = parts[0].trim();
                    String correctAnswer = parts[1].trim();
                    String category = parts[2].trim();
                    // Create a new Question object and add it to the list
                    Question question = new Question(questionText, correctAnswer, category);
                    questionList.add(question);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create an instance of the Quiz class, passing the list of questions as a parameter
        Quiz quiz = new Quiz(questionList);

        // Call the startQuiz() method on the Quiz instance to begin the quiz
        quiz.startQuiz();
    }
}