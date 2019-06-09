
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78
    private int value;
    private int upperLimit;

    public BoundedCounter (int upperLimit, int valueAtBeginning){
        this.upperLimit = upperLimit;
        this.value = valueAtBeginning;
    }

    public void next(){
        if(this.value<upperLimit)
            this.value++;
        else
            this.value = 0;
    }

    public String toString(){
        if(value<10)
            return "0"+this.value;
        return "" + this.value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int parameter){
        if(parameter>=0&&parameter<=this.upperLimit)
            this.value = parameter;
        else
            this.value = 0;
    }
}