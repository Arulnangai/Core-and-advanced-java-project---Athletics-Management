package bean;

import java.util.ArrayList;

public class Sports{
    private int sportId;
    private String sportName;
    private String gameType;
    private String winner;
    private ArrayList<Player> playerArray;

    public Sports(int sportId, String sportName, String gameType, String winner, ArrayList<Player> playerArray) {
        this.sportId = sportId;
        this.sportName = sportName;
        this.gameType = gameType;
        this.winner = winner;
        this.playerArray = playerArray;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public ArrayList<Player> getPlayerArray() {
        return playerArray;
    }

    public void setPlayerArray(ArrayList<Player> playerArray) {
        this.playerArray = playerArray;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sportId=" + sportId +
                ", sportName='" + sportName + '\'' +
                ", gameType='" + gameType + '\'' +
                ", winner='" + winner + '\'' +
                ", playerArray=" + playerArray +
                '}';
    }
}
