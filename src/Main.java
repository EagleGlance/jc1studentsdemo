import com.noirix.data.MyFirstInterface;
import com.noirix.domain.Computer;
import com.noirix.domain.Connectors;
import com.noirix.domain.GamingComputer;
import com.noirix.domain.Gender;

public class Main {

    public static void main(String[] args) {

//        MaterialObject computer = new Computer();
//        MaterialObject ship = new Ship();
//
//        computer.parentBehaviour();
//        ship.parentBehaviour();
//        Computer computer = new Computer();
//        Computer gamingComputer = new GamingComputer();
//
//        computer.parentBehaviour();
//        computer.someBehaviour();
//
//        gamingComputer.parentBehaviour();
//        gamingComputer.someBehaviour();
//
//        System.out.println(computer.equals(gamingComputer));

        System.out.println(Gender.NOT_SELECTED);
        System.out.println(Gender.NOT_SELECTED.ordinal());
        System.out.println(Gender.MALE);
        System.out.println(Gender.MALE.ordinal());
        System.out.println(Gender.FEMALE);
        System.out.println(Gender.FEMALE.ordinal());

        System.out.println(Gender.NOT_SELECTED.name());

        for (Gender value : Gender.values()) {
            System.out.println(value);
        }


        System.out.println(Connectors.USB_3_0.getConnectorDescription());
        System.out.println(Connectors.USB_3_0.getFullInfo());

        System.out.println(Connectors.USB_2_0.getFullInfo());


        MyFirstInterface enumLink = Connectors.USB_3_0;
        MyFirstInterface enumLink2 = Connectors.TYPE_C;

        enumLink.someMethod();
        enumLink.someMethod("asdasd", 1);
        enumLink.someMethod(2);

        enumLink2.someMethod();
        enumLink2.someMethod("asdasd", 1);
        enumLink2.someMethod(2);

    }
}
