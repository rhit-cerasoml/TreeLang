package model.type;

import java.util.ArrayList;

public class FunctionType extends Type{
    Type returnType;
    ArrayList<Type> parameters;

    @Override
    public boolean isFunctionType() {
        return true;
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
