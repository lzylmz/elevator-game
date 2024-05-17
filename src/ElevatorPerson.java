public class ElevatorPerson {

    private int enterTime;
    private int initialPosition;
    private int target;
    private  Person person;

    public ElevatorPerson(Person p, int ip,int t){
        this.initialPosition = ip;
        this.target = t;
        this.person = p;
        enterTime = Elevator.getTravelMeter();

    }
    public Person getPerson(){ return person;}

    public int getTarget(){return target;}

    public String toString(){
        int travelMeter = Math.abs(enterTime - Elevator.getTravelMeter());

        String howFell ;  // these are decide person is happy or unhappy
        if(travelMeter <= Math.abs(target - initialPosition)){ // I am using '<=' less than or equal sign because
            howFell = "happy"; }                                // person who not traveled yet be happy
        else {
            howFell = "unhappy";
        }

        return "I am a " + person.getName() + ". I traveled " + travelMeter + " floors."+ " I am " + howFell + "." ;
    }
}

