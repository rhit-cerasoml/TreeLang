package model.symbol;

import model.type.TypeUnresolved;

public class SymbolUnresolved extends SymbolName {
    private String name;
    public SymbolUnresolved(String name){
        super(new TypeUnresolved(name + ".?type"));
        this.name = name;
    }
}
