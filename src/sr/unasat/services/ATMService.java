package sr.unasat.services;

public class ATMService {

    double availableBalance;
    public ATMService(double availableBalance)
    {
        this.availableBalance = availableBalance;
    }

    String newBalance = "And your new balance is: ";

    public String snelKas(int amountChoice) {
        int[] cashAmounts = {50, 100, 200, 400, 600, 800, 1000};
        String screenMessage = "The chosen amount is Srd ";

        if(amountChoice < availableBalance) {
            switch (amountChoice) {
                case 1:
                    amountChoice = cashAmounts[0];
                    availableBalance = availableBalance - cashAmounts[0];
                    break;
                case 2:
                    amountChoice = cashAmounts[1];
                    availableBalance = availableBalance - cashAmounts[1];
                    break;
                case 3:
                    amountChoice = cashAmounts[2];
                    availableBalance = availableBalance - cashAmounts[2];
                    break;
                case 4:
                    amountChoice = cashAmounts[3];
                    availableBalance = availableBalance - cashAmounts[3];
                    break;
                case 5:
                    amountChoice = cashAmounts[4];
                    availableBalance = availableBalance - cashAmounts[4];
                    break;
                case 6:
                    amountChoice = cashAmounts[5];
                    availableBalance = availableBalance - cashAmounts[5];
                    break;
                case 7:
                    amountChoice = cashAmounts[6];
                    availableBalance = availableBalance - cashAmounts[6];
                    break;
                default:
                    screenMessage = "";
            }return screenMessage + cashAmounts  + " " + newBalance + availableBalance;
        } else{
            return "The chosen a amount is out of range";
        }
    }

}
