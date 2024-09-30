package someSimpleTasks;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Tasks {
    public static final String staticDirectory = "./static";

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

    public static void inputUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String userName = scan.nextLine();
        switch (userName) {
            case "Content" -> {
                System.out.println("That is debil name");
            }
            case "" -> {
                System.out.println("That is empty string name");
            }
            default -> {
                System.out.println("Hello, " + userName);
            }
        }
    }

    public static void simpleCode() {
        int x = 10;
        double y = 100.6;
        System.out.println("Sum x + y = " + (x + y));
        String name = "Oleg", secName = "Rubtsov";
        System.out.println("My name: " + name + " " + secName);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        int[] simpleArray = {1, 2, 3};
        simpleArray[2] = 5;
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + "\t");
        }
        System.out.print("\n");
        final int result = sign(-10);
        System.out.println(result);
        int loosingData = (int) (y / x);
        System.out.println("loosingData: " + loosingData);
        int param = 1;
        while (true) {
            if (param > 5)
                break;
            System.out.print(param + "\t");
            param++;
        }
        System.out.print('\n');
        int[] arr = new int[5];
        arr[2] = 99;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        Car[] carArray = {new Car("Toyota", 1999), new Car("Mazda", 2000), new Car("Nissan", 1995)};
        System.out.println(Arrays.toString(arr));
    }

    public static void timerCode() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimer(timer), 0, 1000);
    }

    public static <T> T serializedCode(T obj) throws IOException, ClassNotFoundException {
        final String serDirectory = staticDirectory + "/test.ser";
        FileOutputStream outputStream = new FileOutputStream(serDirectory);
        FileInputStream inputStream = new FileInputStream(serDirectory);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        T ser = (T) objectInputStream.readObject();
        return ser;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        simpleCode();
        printHello();
        Car car = new Car("CarMake", 1999);
        car.displayInfo();
        printUpperCaseString();
        replaceString();
        for (Field field : car.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
        }
        Car serCar = serializedCode(car);
    }
}
