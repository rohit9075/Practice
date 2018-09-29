package polymorphism;

public class Utils {

    public static Bank getObject(String bankSelected) {

        Bank b = new Bank();

        if (bankSelected.equals("SBI")){
            b = new Sbi();
        }
        else if(bankSelected.equals("PNB")){
            b = new Pnb();
        }

        return b;
    }
}
