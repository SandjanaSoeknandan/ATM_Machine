package sr.unasat.app;

import sr.unasat.services.ATMChallangeService;
import sr.unasat.services.ATMService;
import sr.unasat.storage.Users;

import java.text.DecimalFormat;

public class Application {
    public static void main(String[] args) {

        ATMService atm = new ATMService(7000.00);
        //System.out.println(atm.snelKas(3));

        //----------------------------------------------------
        //challange ------------------------------------------

        Users user1 = new Users("Shiven", "Someone", 5000.00, 1402);
        Users user2 = new Users("Ayaan", "Ramadhin", 3500.00, 3003);
        Users user3 = new Users("Siddhart", "Someone", 7000.00, 1717);

        ATMChallangeService atmChallangeService = new ATMChallangeService(user1, user2, user3);
        atmChallangeService.atm_machine_activity(1717, 2, 500.00);





    }
}
