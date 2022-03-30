import com.noirix.data.CommonData;
import com.noirix.domain.Computer;
import com.noirix.domain.Ship;
import com.noirix.inner.Outer;

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
//
//        System.out.println(Gender.NOT_SELECTED);
//        System.out.println(Gender.NOT_SELECTED.ordinal());
//        System.out.println(Gender.MALE);
//        System.out.println(Gender.MALE.ordinal());
//        System.out.println(Gender.FEMALE);
//        System.out.println(Gender.FEMALE.ordinal());
//
//        System.out.println(Gender.NOT_SELECTED.name());
//
//        for (Gender value : Gender.values()) {
//            System.out.println(value);
//        }
//
//
//        System.out.println(Connectors.USB_3_0.getConnectorDescription());
//        System.out.println(Connectors.USB_3_0.getFullInfo());
//
//        System.out.println(Connectors.USB_2_0.getFullInfo());
//
//
//        MyFirstInterface enumLink = Connectors.USB_3_0;
//        MyFirstInterface enumLink2 = Connectors.TYPE_C;
//
//        enumLink.someMethod();
//        enumLink.someMethod("asdasd", 1);
//        enumLink.someMethod(2);
//
//        enumLink2.someMethod();
//        enumLink2.someMethod("asdasd", 1);
//        enumLink2.someMethod(2);

        /*<> - diamond operator*/
        //CommonData<Object, Object> genericData1 = new CommonData<>();
        CommonData<Integer, Computer> genericData2 = new CommonData<>();
        //<String, Integer> genericData3 = new CommonData<>();

        //useless statement according to diamond operator
        //CommonData<String, Integer> genericData4 = new CommonData<String, Integer>();

//        genericData1.setId(12);
//        genericData1.setName(5453454);
//        System.out.println(genericData1);

        genericData2.setId(12);
        genericData2.setName(new Computer());
        System.out.println(genericData2);

//        genericData3.setId("12");
//        genericData3.setName(5453454);
//        System.out.println(genericData3);

        Outer outer = new Outer();

        Outer.Inner inner = new Outer().new Inner();
        System.out.println(Outer.Inner.SOME_INNER_CONSTANT);
        String innerStr = inner.getInnerStr();

        System.out.println(innerStr);

        Outer.InnerStatic.someStaticLogic();


        Computer computer = new Computer();
        Computer computer1 = new Computer() {
            @Override
            public String toString() {
                return "haha! method was changed!";
            }
        };

        Computer computer2 = new Computer() {
            @Override
            public String toString() {
                return "haha! method was changed2!";
            }
        };

        Computer computer3 = new Computer() {
            @Override
            public String toString() {
                return "haha! method was changed!";
            }
        };

        System.out.println(computer);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);

    }
}
