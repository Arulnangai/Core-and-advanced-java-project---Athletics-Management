package util;

import bean.DateValidator;
import bean.Player;
import bean.Sports;
import bean.TournamentDetails;
import exception.InvalidTournament;
import exception.NoSportsExist;
import exception.TournamentAlreadyExists;

import java.util.ArrayList;

public interface AthleticsManagementInterface {
    public void addNewTournament(TournamentDetails t)throws TournamentAlreadyExists;
    public boolean updateTournamentStatus(int tournamentId, int sportId, String winner)throws InvalidTournament;
    public ArrayList<Sports> retrieveSports(int tournamentId)throws NoSportsExist;
    public int findParticipantCount(int sportId);
    public ArrayList<Player> getAllPlayerWithExperience(int experience);
}
