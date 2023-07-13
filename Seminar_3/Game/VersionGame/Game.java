package Seminar_3.Game.VersionGame;

import Seminar_3.Game.Answer;
import Seminar_3.Game.GameStatus;

public interface Game {
    void start(int lengthWord, int countTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
