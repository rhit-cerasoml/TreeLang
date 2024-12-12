package model.type;

public abstract class Type {
    String getName(){
        return this.toString();
    }
    public abstract boolean isFunctionType();
    public abstract boolean isValueType();
    public abstract boolean isClassType();
}
