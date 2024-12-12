package model.type;

public class PrimitiveType extends Type {
    String typeName;
    public PrimitiveType(String typeName){
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
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
        return true;
    }
}
