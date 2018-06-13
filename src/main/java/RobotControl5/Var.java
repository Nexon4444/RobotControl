package RobotControl5;

import exceptions.RobotControlException;

public class Var implements Comparable<Var> {

    private Type type;
    private String value;
    private Boolean isNull;
    public Var(Type type, String value) {
        this.type = type;
        this.value = value;
        this.isNull = false;
    }
    public Var(Type type, String value, Boolean isNull) {
        this.type = type;
        this.value = value;
        this.isNull = isNull;
    }

/*
    public Var() {
        this.type = null;
        this.value = null;
        this.isNull = true;
    }
*/

    @Override
    public int compareTo(Var v) {
        if (!this.getType().equals(v.getType()))
            try {
                throw new RobotControlException("Vars have to be the same type");
            } catch (RobotControlException e) {
                e.printStackTrace();
            }
        if (this.getValue().equals(v.getValue()) || this.getNull().equals(v.getNull()))
            return 0;
        if (this.getType().equals(Type.INT)) {
            return Integer.compare(Integer.valueOf(this.getValue()), Integer.valueOf(v.getValue()));
        } else {
            return -1;
        }
    }

    public Boolean getNull() {
        return isNull;
    }

    public void setNull(Boolean aNull) {
        isNull = aNull;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new String("Type: " + type + ", Value: " + value + ", isNull: " + isNull);
    }
}