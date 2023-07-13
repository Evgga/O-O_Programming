package Seminar_3.Game.VersionGame;

import Seminar_3.Game.Answer;
import Seminar_3.Game.GameStatus;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected int lengthWord;
    protected int countTry;
    protected String word;
    protected GameStatus status = GameStatus.INIT;


    public AbstractGame(int lengthWord, int countTry, String word, GameStatus status) {
        this.lengthWord = lengthWord;
        this.countTry = countTry;
        this.word = word;
        this.status = status;
    }

    public AbstractGame() {
    }

    @Override
    public void start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.lengthWord = lengthWord;
        this.countTry = countTry;
        word = generateWord();
    }

    private String generateWord() {
        List<String> strlist = generateCharList();
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lengthWord; i++) {
            int index = r.nextInt(strlist.size());
            sb.append(strlist.get(index));
            strlist.remove(index);
        }
        return sb.toString();
    }

    public abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String value) {
        if (--countTry == 0) {
            status = GameStatus.LOSE;
        }
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) bulls++;
            if (word.contains(String.valueOf(value.charAt(i)))) cows++;
        }
        if (bulls == lengthWord) status = GameStatus.WIN;
        return new Answer(bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }

    public String getWord() {
        return word;
    }
}
