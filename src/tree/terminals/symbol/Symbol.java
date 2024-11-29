package tree.terminals.symbol;

import editor.model.StringStack;
import editor.model.StringTerminal;
import tree.DefaultNode;

import java.awt.*;

public class Symbol extends DefaultNode implements ISymbol {
    String name;
    public Symbol(String name){
        this.name = name;
    }

    @Override
    public StringStack createStringStack() {
        return new StringTerminal(name, Color.green, this);
    }
}
