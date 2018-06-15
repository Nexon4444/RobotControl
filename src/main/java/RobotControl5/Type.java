package RobotControl5;

public enum Type {
    INT("Integer"), DOUBLE("Double"), STRING("String"), ROBOT("Robot"), BOOLEAN("Boolean");
    private String name;

    Type(String name) {
        this.name = name;
    }
}
