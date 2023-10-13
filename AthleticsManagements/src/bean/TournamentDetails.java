package bean;

import java.util.ArrayList;
import java.util.Date;

public class TournamentDetails {
    private int tournamentId;
    private Date tournamentStartDate;
    private Date tournamentEndDate;
    private ArrayList<Sports> sportsArrayList;

    public TournamentDetails(int tournamentId, Date tournamentStartDate, Date tournamentEndDate, ArrayList<Sports> sportsArrayList) {
        this.tournamentId = tournamentId;
        this.tournamentStartDate = tournamentStartDate;
        this.tournamentEndDate = tournamentEndDate;
        this.sportsArrayList = sportsArrayList;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Date getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(Date tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public Date getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(Date tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public ArrayList<Sports> getSportsArrayList() {
        return sportsArrayList;
    }

    public void setSportsArrayList(ArrayList<Sports> sportsArrayList) {
        this.sportsArrayList = sportsArrayList;
    }

    @Override
    public String toString() {
        return "TournamentDetails{" +
                "tournamentId=" + tournamentId +
                ", tournamentStartDate=" + tournamentStartDate +
                ", tournamentEndDate=" + tournamentEndDate +
                ", sportsArrayList=" + sportsArrayList +
                '}';
    }
}
