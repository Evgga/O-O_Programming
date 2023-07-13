package Seminar_3.Game;

public class Logging {
    private String step;
    private  String value;
    private Answer answer;

    static int count;

    public Logging(String step, String value) {
        this.step = step;
        this.value = value;
        answer = new Answer(0,0);
    }

    public Logging(String value, Answer answer) {
        this.step = "Попытка " + ++count;
        this.value = value;
        this.answer = answer;
    }

    public Logging(String step, String value, Answer answer) {
        this.step = step;
        this.value = value;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "* "+ step + ", "+ value + ", " + answer.getBulls() + ", " + answer.getCows();
    }
}
