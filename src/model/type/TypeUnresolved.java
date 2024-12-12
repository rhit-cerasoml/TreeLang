package model.type;

public class TypeUnresolved extends Type {
    private String name;
    public TypeUnresolved(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "?" + name;
    }

    @Override
    public boolean isFunctionType() {
        return false;
    }

    @Override
    public boolean isValueType() {
        return false;
    }

    @Override
    public boolean isClassType() {
        return false;
    }
}
