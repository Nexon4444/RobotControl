package RobotControl5;

public enum Type {
    INT("Integer"), DOUBLE("Double"), STRING("String"), ROBOT("Robot");
    private String name;

    Type(String name) {
        this.name = name;
    }
}
