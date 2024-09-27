package someSimpleTasks;

import java.util.Scanner;

public class Tasks {
    public static String string = "Hello world!!!";
    public static void printHello() {
        System.out.println(string + ", length - " + string.length());
    }

    public static void printUpperCaseString() {
        System.out.println(string.toUpperCase());
    }

    public static void replaceString() {
        String str = "Hello, Java!!!";
        String replacedStr = str.replace("Java", "Kotlin");
        System.out.println("Original str: " + str + ", replaced str: " + replacedStr);
    }

    public static int sign(int num) {
        return num == 0 ? 0 : num > 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        int x = 10;
        double y = 100.6;
        System.out.println("Sum x + y = " + (x + y));
        String name = "Oleg", secName = "Rubtsov";
        System.out.println("My name: " + name + " " + secName);
        // todo rubtsov comment
        /*
         * multiline
         * comment
         */
        printHello();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        new Car("CarMake", 1999).displayInfo();
        printUpperCaseString();
        replaceString();
        int[] simpleArray = {1, 2, 3};
        simpleArray[2] = 5;
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + "\t");
        }
        System.out.print('\n');
        System.out.println("hello".equals("world"));
        System.out.println(name.length() > 0 && secName.length() > 0);
        System.out.println(name.contains("oleg") || secName.contains("ov"));
        final int result = sign(-10);
        System.out.println(x);
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName);
        int loosingData = (int)(y / x);
        System.out.println("loosingData: " + loosingData);
        int param = 1;
        while(true) {
            if(param > 5)
                break;
            System.out.print(param + "\t");
            param++;
        }
        System.out.print('\n');
    }
}
