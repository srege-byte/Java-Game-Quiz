public class Question {

    private String questionText;
    private String correctAnswer;
    private String category;

    public Question(String questionText,String correctAnswer,String category){
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.category = category;

    }

    //Get Methods
    public String getQuestionText() {
        return questionText;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public String getCategory() {
        return category;
    }


    // Set methods
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void displayQuestion(){
        System.out.println("Question: " + questionText);
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}
