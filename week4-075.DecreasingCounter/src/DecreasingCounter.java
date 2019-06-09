public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int remember;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.remember =this.value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(this.value>0)
            this.value -= 1;
    }

    public void reset(){
        this.value=0;
    }

    public void setInitial(){
        this.value = this.remember;
    }
}
