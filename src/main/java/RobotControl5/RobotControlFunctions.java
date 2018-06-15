package RobotControl5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobotControlFunctions {
    public static void left(Var angle, String robot) {
        turn(-Double.parseDouble(angle.getValue()), robot);
    }

    public static void right(Var angle, String robot) {
        turn(Double.parseDouble(angle.getValue()), robot);
    }

    public static void front(Var distance, String robot) {
        move(Double.parseDouble(distance.getValue()), robot);
    }

    public static void back(Var distance, String robot) {
        move(-Double.parseDouble(distance.getValue()), robot);

    }

    public static void setSpeed(Var speed, String robot) {
        System.out.println("Robot: " + robot + ", Speed set: " + speed.getValue());
    }

    public static String initialize(String path)  {
        FileReader file = null;
        try {
            file = new FileReader(path.replaceAll("\"", ""));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner reader = new Scanner(file);

        var x = reader.nextInt();
        var y = reader.nextInt();
        var angle = reader.next();
        var speed = reader.next();
        return convertPosToString(x, y, Double.parseDouble(angle), Integer.parseInt(speed));
    }

    public static String convertPosToString(Integer posX, Integer posY, Double angle, Integer speed) {
        return new String(posX + " " + posY + " " + angle + " " + speed);
    }

    //    public static
    private static void move(double distance, String robot) {
        System.out.println("Robot: " + robot + ", moved: " + distance);
    }

    private static void turn(double angle, String robot) {
        System.out.println("Robot: " + robot + ", turned: " + angle);
    }
}
