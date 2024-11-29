package model;

import model.symbol.SymbolName;
import model.symbol.SymbolUnresolved;

import java.util.HashMap;

public class Scope {
    private static final Scope ROOT_SCOPE = new Scope(true);
    private HashMap<String, SymbolName> environment = new HashMap<>();
    private Scope enclosingScope;
    private final boolean isRoot;
    private Scope(boolean root){
        isRoot = true;
    }

    public Scope(){
        isRoot = false;
        this.enclosingScope = ROOT_SCOPE;
    }

    public Scope(Scope enclosingScope){
        isRoot = false;
        this.enclosingScope = enclosingScope;
    }

    public SymbolName resolveVariable(String name){
        if(isRoot){
            return new SymbolUnresolved(name);
        }
        SymbolName sname;
        if((sname = environment.get(name)) != null){
            return sname;
        }
        return enclosingScope.resolveVariable(name);
    }

}
