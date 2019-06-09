public class Reformatory {
    private int measure = 0;

    public int weight(Person person) {
        measure += 1;
        return person.getWeight();
    }

    public void feed (Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return measure;
    }
}
