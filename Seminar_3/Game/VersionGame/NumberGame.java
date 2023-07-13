package Seminar_3.Game.VersionGame;

import java.util.ArrayList;
import java.util.List;

public class NumberGame {
    //@Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strList.add(Integer.toString(i));
        }
        return strList;
    }
}
