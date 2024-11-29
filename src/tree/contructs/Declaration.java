package tree.contructs;

import editor.model.StringStack;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.symbol.IncompleteSymbol;
import tree.terminals.symbol.Symbol;

public class Declaration extends DefaultNode implements INode {
    INode type;
    INode symbol;

    @Override
    public StringStack createStringStack() {
        StringStack ss = new StringStack();
        ss.add(type.createStringStack());
        ss.add(" ", this);
        ss.add(symbol.createStringStack());
        ss.add("\n", this);
        return ss;
    }

    public Declaration(){
        type = new IncompleteSymbol();
        symbol = new IncompleteSymbol();
    }

    public void setType(Symbol s){
        this.type = s;
    }

    public void setSymbol(Symbol s){
        this.symbol = s;
    }
}
