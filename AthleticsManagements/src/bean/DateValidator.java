package bean;

import java.util.ArrayList;

public class DateValidator {
    private boolean validateDate;
    private ArrayList<TournamentDetails> tournamentDetailsArrayList;

    public DateValidator(boolean validateDate) {

        this.validateDate = validateDate;
    }



    public boolean isValidateDate() {
        return validateDate;
    }

    public void setValidateDate(boolean validateDate) {
        this.validateDate = validateDate;
    }

    @Override
    public String toString() {
        return "DateValidator{" +
                "validateDate=" + validateDate +
                '}';
    }

    public boolean DateValidator()
    {
        for(TournamentDetails i : tournamentDetailsArrayList)
        {
            if(i.getTournamentStartDate().compareTo(i.getTournamentEndDate()) >= 0)
            {
                System.out.println("We can proceed with the dates");
                return true;
            }

        }
        return false;
    }

}
