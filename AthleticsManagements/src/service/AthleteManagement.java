package service;

import bean.DateValidator;
import bean.Player;
import bean.Sports;
import bean.TournamentDetails;
import exception.InvalidTournament;
import exception.NoSportsExist;
import exception.TournamentAlreadyExists;
import util.AthleticsManagementInterface;

import java.util.ArrayList;

public class AthleteManagement implements AthleticsManagementInterface {

    ArrayList<TournamentDetails> tournamentDetailsArrayList = new ArrayList<>();
    private DateValidator dateValidator;
    @Override
    public void addNewTournament(TournamentDetails t) throws TournamentAlreadyExists {

    }

    @Override
    public boolean updateTournamentStatus(int tournamentId, int sportId, String winner) throws InvalidTournament {
        return false;
    }

    @Override
    public ArrayList<Sports> retrieveSports(int tournamentId) throws NoSportsExist {
        return null;
    }

    @Override
    public int findParticipantCount(int sportId) {
        return 0;
    }

    @Override
    public ArrayList<Player> getAllPlayerWithExperience(int experience) {
        return null;
    }
}
