package RobotControl5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobotControlFunctions {
    public static void left(Var angle) {
        turn(-Double.parseDouble(angle.getValue()));
    }

    public static void right(Var angle) {
        turn(Double.parseDouble(angle.getValue()));
    }

    public static void front(Var distance) {
        System.out.println(distance.getValue());
        move(Double.parseDouble(distance.getValue()));
    }

    public static void back(Var distance) {
        move(-Double.parseDouble(distance.getValue()));
        ;
    }

    public static void setSpeed(Var speed) {
        System.out.println("Speed set: " + speed.getValue());
    }

    public static String initialize(String path)  {
        FileReader file = null;
        System.out.println("path: " + path.equals("resource/robotInitialize1.txt"));
        System.out.println("comparing: \n" + path.replaceAll("\"", "") + "\n" + "resource/robotInitialize1.txt");
//        path = "resource/robotInitialize1.txt";
        try {
            file = new FileReader(path.replaceAll("\"", ""));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner reader = new Scanner(file);

        var x = reader.nextInt();
        var y = reader.nextInt();
        var angle = reader.next();
        return convertPosToString(x, y, Double.parseDouble(angle));
    }

    public static String convertPosToString(Integer posX, Integer posY, Double angle) {
        return new String(posX + " " + posY + " " + angle);
    }

    //    public static
    private static void move(double distance) {
        System.out.println("Robot moved: " + distance);
    }

    private static void turn(double angle) {
        System.out.println("Robot turned: " + angle);
    }
}
