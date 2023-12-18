import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Question question1 = new Question("Sa planete ka Sistemi Diellor?", "7", "Space");
        Question question2 = new Question("Sa satelite(hena) ka Jupiteri", "95", "Space");
        Question question3 = new Question("Cfare eshte Pluto?", "Planet Xhuxh", "Space");

        List<Question> questionList = new ArrayList<>();
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        Quiz quiz = new Quiz(questionList);

        quiz.startQuiz();
    }
}