package model.type;

import model.type.Type;

public class TypeUnresolved extends Type {
    private String name;
    public TypeUnresolved(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "?" + name;
    }
}
