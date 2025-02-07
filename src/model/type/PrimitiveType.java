package model.type;

import tree.terminals.type.ITypeProvider;

public class PrimitiveType extends Type implements ITypeProvider {
    private String typeName;
    public PrimitiveType(String typeName){
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }

    @Override
    public Type resolve() {
        return this;
    }
}
