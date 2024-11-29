package model.symbol;

import model.type.Type;

public class SymbolName {
    Type type;
    public SymbolName(Type type){
        this.type = type;
    }
    public Type getType(){
        return type;
    }
}
