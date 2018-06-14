package RobotControl5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public  class RobotControlFunctions {
    public static void left(Var angle)
    {
        turn(-Double.parseDouble(angle.getValue()));
    }

    public static void right(Var angle)
    {
        turn(Double.parseDouble(angle.getValue()));
    }

    public static void front(Var distance)
    {
        System.out.println(distance.getValue());
        move(Double.parseDouble(distance.getValue()));
    }

    public static void back(Var distance)
    {
        move(-Double.parseDouble(distance.getValue()));;
    }

    public static void setSpeed(Var speed)
    {
        System.out.println("Speed set: " + speed.getValue());
    }

    public static void initialize(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            var x = line.substring(0, )
            while (line != null)
            {}

    }
    public static String convertPosToString(Integer posX, Integer posY, Double angle)
    {

    }

//    public static
    private static void move(double distance){
        System.out.println("Robot moved: " + distance);
    }

    private static void turn(double angle) {
        System.out.println("Robot turned: " + angle);
    }
}
