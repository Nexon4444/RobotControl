package RobotControl5;

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
        move(Double.parseDouble(distance.getValue()));
    }

    public static void back(Var distance)
    {
        move(-Double.parseDouble(distance.getValue()));;
    }

    private static void move(double distance){
        System.out.println("Robot moved" + distance);
    }

    private static void turn(double angle) {
        System.out.println("Robot turned" + angle);
    }
}
