
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;  //why it is working inspite lack of value (example = 0)

    public NumberStatistics(){
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number){
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        if(this.amountOfNumbers==0)
            return 0.0;
        return (double)this.sum/this.amountOfNumbers;
    }
}