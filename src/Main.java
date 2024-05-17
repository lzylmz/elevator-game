//Abdullah Bulbul
//simple test file for quiz 3

public class Main {

    public static void main(String[] args) {
        ElevatorPerson ep = new ElevatorPerson(new Person("Ebru"), 2, 5);
        System.out.println(ep); //not traveled yet so she is happy.
//try Elevator
        Elevator e = new Elevator();
        Person p1 = new Student("Ali", 1);
        Person p2 = new Student("Zeynep", 2);
        Person p3 = new Professor("Fatih", 1);
        Person p4 = new Professor("fa", 1);
        Person p5 = new Professor("tih", 1);
        e.enter(p1,8);
        e.goToFloor(1);
        e.enter(p2,2);
        e.goToFloor(5);
        e.enter(p3,8);
        e.enter(p4, 9);
        e.enter(p5,8);
        e.goToFloor(8);



    }
}
