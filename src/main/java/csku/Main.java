package csku;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*DataSourceDB dataSourceDB = new DataSourceDB();
        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
        Bank bank = new Bank("My Bank", dataSourceFile);
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();*/

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        ATM atm = context.getBean(ATM.class);

        String name = atm.validateCustomer(2,2345);
        System.out.println( name + "has" + atm.getBalance());
        atm.withdraw(400);
        System.out.println( name + "has" + atm.getBalance());
    }
}
