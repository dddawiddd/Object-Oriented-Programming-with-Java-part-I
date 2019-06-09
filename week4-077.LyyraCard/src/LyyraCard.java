import java.util.Scanner;

public class LyyraCard {

    private double balance;

    public LyyraCard(double balance){
        this.balance = balance;
    }

    public String toString(){
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical(){
        if(this.balance>=2.5)
            this.balance -= 2.5;
    }

    public void payGourmet(){
        if(this.balance>=4)
            this.balance -= 4.0;
    }

    public void loadMoney(double grow){
        if(grow>0){
            double asd = this.balance + grow;
            if(asd<=150)
                this.balance = asd;
            else
                this.balance = 150;
        }
    }
}
