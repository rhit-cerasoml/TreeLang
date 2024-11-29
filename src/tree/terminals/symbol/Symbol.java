package tree.terminals.symbol;

import editor.model.IStringStackElement;
import editor.model.StringStackTerminal;
import tree.DefaultNode;

import java.awt.*;

public class Symbol extends DefaultNode implements ISymbol {
    String name;
    public Symbol(String name){
        this.name = name;
    }

    @Override
    public IStringStackElement createStringStack() {
        return new StringStackTerminal(name, Color.green, this);
    }
}
