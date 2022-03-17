//Hello
/*Hello*/

/*CamelCase*/

import com.noirix.data.Data;

import java.util.ArrayList;
import java.util.List;

//1. Создание стартового класса для приложения
public class Main {
    private static Boolean someBoolWrap = null;

    //2. Создание стартового main метода для выполнения логики
    public static void main(String[] args) {
        //System.out.println - вывод информации на консоль
        /*//\n - переход на новую строку
        System.out.println("Hello World!");
        System.out.println(1+2);
        System.out.println(1+2);

        //целочисленные значения
        int a = 4;  //
        int b = 7;
        //Ctrl+Shift+UP/DOWN

        System.out.println(a);

        //значения с плавающей точкой
        double d = 5;
        System.out.println(d);

        //логическое значение
        boolean b1 = true;
        System.out.println(b1);

        //hot keys
        //sout = System.out.println(
        //psvm = public static void main(String[] args) {

        //строковое
        System.out.println('a');
        System.out.println("askdjahsdkjha");

        char c = 'w';
        char cc = 120;

        String str = "Some String!";

        System.out.println(c);
        System.out.println(cc);
        System.out.println(str);

        System.out.println(6 + 4.5);

        int first = 6;
        double second = 4.5;

        int result = first + (int) second;
        System.out.println(result);


        //перегруженная операция
        //+ для строк соединяет строки воедино
        System.out.println("first" + "second");

        double d1 = 8.7;
        double d2 = 9.7;
        double d3 = 10.7;
        double firstResult = d1*d2;
        double secondResult = d2*d3;
        double thirdResult = d1*d3;

        if (firstResult > secondResult) {
            System.out.println("First case");
        } else {
            System.out.println("Second case");
        }


        String s1 = "java";


        int i = 10; //0;
        Integer iWrap = 10; //null;*/

//        boolean someBool = false;
//
//        System.out.println(someBool);
//        System.out.println(someBoolWrap);
//        Boolean bb = false;
//
//
//        Integer a = 71;
//        Integer bbbb = 71;
//        Integer aa = ++a;
//
//        int b = 7;
//
//        String s1 = "java";
//        String s2 = "java";
//
//        Integer someBigNameOfInt = 10;
//
//        System.out.println(a + b + aa);


        // && - and
        // || - or
        int someValue = 10;
        int someRestrictionValue = 0;
        int anotherRestrictionValue = 10;

        //Ctrl+W - выделение слова целиком
//
//        boolean result =
//                someValue > someRestrictionValue &&
//                someValue < anotherRestrictionValue &&
//                someValue < 1_000_000_000;
//
//        if (result) { //result == true alternative result
//            //if true
//            System.out.println("First case");
//        } else {
//            //if false
//            System.out.println("Second case");
//
//            if (someValue > someRestrictionValue) {
//                if (2 > 0) {
//
//                }
//            }
//        }


        /*1. While loop*/
        int count = 0;

        while(count < 10) {
            System.out.println("Ha ha ha!" + count);
            //count = count + 1;
            count += 1;
        }
        count = 0;

        /*2. Do/while loop*/

        do {
            System.out.println("Do while section!");
        } while (count < 0);

        /*3. For*/


        for (int i = 0; i % 2 == 0; i++) {
            System.out.println(i);
        }


        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }


        System.out.println("Array print");
        int[] array = new int[10];
        array[0] = 100;
        array[1] = 177;

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        /*Collections API, iterator work here*/
        List<String> strings = new ArrayList<>();
        for (String temp : strings) {
            System.out.println(temp);
        }

        // for (;;){}
        // while(true){}


        String month = "JAN";

        switch(month) {
            case "JAN":
            case "JUL":
                System.out.println("HoHoHo!");
            default:
                System.out.println("We didn't catch any months!");
        }


        System.out.println(1 > 0 ? "True" : "false");


        Data data = new Data();
        Data data1 = new Data();
        Data data2 = new Data();

    }
}
