package bean;

import java.util.ArrayList;

public class Tennis extends Sports{
    public Tennis(int sportId, String sportName, String gameType, String winner, ArrayList<Player> playerArray) {
        super(sportId, sportName, gameType, winner, playerArray);
    }

    @Override
    public String toString() {
        return "Tennis{}";
    }
}
