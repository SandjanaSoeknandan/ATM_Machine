package sr.unasat.services;

import sr.unasat.storage.Users;

import java.text.DecimalFormat;

public class ATMChallangeService {
    Users user1;
    Users user2;
    Users user3;

    public ATMChallangeService(Users user1, Users user2, Users user3) {
        this.user1 = user1;
        this.user2 = user2;
        this.user3 = user3;
    }
    
    public String atm_machine_activity(int pincode, int choose_atm_activity, double withdrawing_balance) {

        String pattern = "###.###,##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String formattedUser1Balanace = decimalFormat.format(user1.getBalance());
        String formattedUser2Balanace = decimalFormat.format(user2.getBalance());
        String formattedUser3Balanace = decimalFormat.format(user3.getBalance());

        String message = null;
        if (pincode == user1.getPincode() && withdrawing_balance <= user1.getBalance()) {
            switch (choose_atm_activity) {
                case 1:
                    message = "Dear " + user1.getFirstName() + user1.getLastName() + ","
                            + "\nYour current balance is $" + formattedUser1Balanace
                            + "                             \nThank you";
                    break;
                case 2:
                    message = "Dear" + user1.getFirstName() + user1.getLastName() + ","
                            + "\nYour new balance is "
                            + decimalFormat.format(user1.getBalance() - withdrawing_balance)
                            + "\nPlease take your money and receipt";
                    break;
                default:
                    message = "-------Please make sure you chose the right activity-------";
            }
        } else if (pincode == user2.getPincode() && withdrawing_balance <= user2.getBalance()) {
            switch (choose_atm_activity) {
                case 1:
                    message = "Dear " + user2.getFirstName() + user2.getLastName() + ","
                            + "\nYour current balance is $" + formattedUser2Balanace
                            + "                             \nThank you";
                    break;
                case 2:
                    message = "Dear" + user2.getFirstName() + user2.getLastName() + ","
                            + "\nYour new balance is "
                            + decimalFormat.format(user2.getBalance() - withdrawing_balance)
                            + "\nPlease take your money and receipt";
                    break;
                default:
                    message = "-------Please make sure you chose the right activity-------";
            }
        } else if (pincode == user3.getPincode() && withdrawing_balance <= user3.getBalance()) {
                switch (choose_atm_activity) {
                    case 1:
                        message = "Dear " + user3.getFirstName() + user3.getLastName() + ","
                                + "\nYour current balance is $" + formattedUser3Balanace
                                + "                             \nThank you";
                        break;
                    case 2:
                        message = "Dear" + user3.getFirstName() + user3.getLastName() + ","
                                + "\nYour new balance is "
                                + decimalFormat.format(user3.getBalance() - withdrawing_balance)
                                + "\nPlease take your money and receipt";
                        break;
                    default:
                        message = "-------Please make sure you chose the right activity-------";
                }
        } else if (pincode != user1.getPincode() && pincode != user2.getPincode() && pincode != user3.getPincode()) {
            message = "-------Invalid pincode-------";
        }
        return message;
    }

}
