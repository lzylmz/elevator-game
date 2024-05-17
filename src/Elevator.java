public class Elevator {

    private static int travelMeter ;
    private int currentFloor;
    private int maxFloor;
    private int minFloor;
    private int capacity;
    private MyStack people = new MyStack();
    private MyStack rePeople = new MyStack();


    public Elevator(){
        currentFloor =0;
        maxFloor = 10;
        minFloor = 0;
        capacity = 5 ;
    }

    public Elevator(int size, int minFloor, int maxFloor){
        currentFloor =0;
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        this.capacity = size ;
    }

    public boolean enter(Person p, int target ) {

        if(target < minFloor || target > maxFloor) {
            throw new IllegalArgumentException("target " + target + " out of bounds.");
        }

        else {
            ElevatorPerson elevatorPerson = new ElevatorPerson(p, currentFloor, target);
            if (capacity > people.getSize()) {
                people.push(elevatorPerson);
                System.out.println(p.getName() + " is in.");
                return true;
            } else {
                return false;
            }
        }
    }

    public void goToFloor(int floor){


        travelMeter  = travelMeter + (Math.abs(currentFloor - floor));
        currentFloor = floor;

   while (!people.isEmpty()){

        ElevatorPerson per = (ElevatorPerson) people.peek();
        if ( per.getTarget() == currentFloor){
            System.out.println(per.getPerson().getName() + " is out.");
            Object o = people.pop();  // for writing person who get off the elevator
            System.out.println(o);

        } else{
            rePeople.push(per);
            people.pop();

        }
        }
        while(!rePeople.isEmpty()){
            people.push(rePeople.peek());
            rePeople.pop();

    }
        System.out.println(this);
    }

    public static int getTravelMeter() {return travelMeter;}
    public void releaseEveryone(){
        while(!isEmpty())
        {
            ElevatorPerson per = (ElevatorPerson) people.peek();
            goToFloor(per.getTarget());
        }
    }

    public boolean isFull() {
        if (capacity == people.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        return people.isEmpty();
    }



    public String toString(){
        return "Elevator is on floor: " + currentFloor + ", Number of people: " + people.getSize();
    }

}


