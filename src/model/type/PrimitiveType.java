package model.type;

import model.type.Type;

public class PrimitiveType extends Type {
    String typeName;
    public PrimitiveType(String typeName){
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}