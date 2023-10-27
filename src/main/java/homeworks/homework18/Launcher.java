package homeworks.homework18;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) throws ErrorOperation {

        System.out.println("_______________New Client:_______________");
        Client individualClient = new IndividualClient();
        individualClient.setName("Jack Luck");
        individualClient.setAmount(500.0);
        individualClient.getInfo();
        individualClient.deposit(100.0);
        individualClient.withdrawal(100.0);

        System.out.println("_______________New Client:_______________");
        Client entityClient = new EntityClient();
        entityClient.setName("James Bond");
        entityClient.setAmount(1000.0);
        entityClient.getInfo();
        entityClient.deposit(100.0);
        entityClient.withdrawal(100);

        System.out.println("_______________New Client:_______________");
        Client individualEntrepreneur = new IndividualEntrepreneur();
        individualEntrepreneur.setName("Will Smith");
        individualEntrepreneur.setAmount(1500.0);
        individualEntrepreneur.getInfo();
        individualEntrepreneur.deposit(999);
        individualEntrepreneur.deposit(2000);
        individualEntrepreneur.withdrawal(1000);

    }


}
