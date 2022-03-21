import com.noirix.domain.Computer;
import com.noirix.domain.GamingComputer;

public class Main {

    public static void main(String[] args) {

//        MaterialObject computer = new Computer();
//        MaterialObject ship = new Ship();
//
//        computer.parentBehaviour();
//        ship.parentBehaviour();
        Computer computer = new Computer();
        Computer gamingComputer = new GamingComputer();

        computer.parentBehaviour();
        computer.someBehaviour();

        gamingComputer.parentBehaviour();
        gamingComputer.someBehaviour();

        System.out.println(computer.equals(gamingComputer));

    }
}
