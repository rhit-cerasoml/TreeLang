package tree.contructs;

import editor.model.IStringStackElement;
import editor.model.StringStack;
import editor.model.StringStackTerminal;
import tree.*;
import tree.terminals.symbol.ISymbol;
import tree.terminals.symbol.IncompleteSymbol;
import tree.terminals.symbol.Symbol;
import tree.terminals.value.IValue;
import tree.terminals.value.IncompleteValue;

import java.awt.*;

public class Assignment extends DefaultNode implements INode {
    ISymbol LHS;
    IValue RHS;

    @Override
    public IStringStackElement createStringStack() {
        StringStack ss = new StringStack();
        ss.add(LHS.createStringStack());
        ss.add(new StringStackTerminal(" = ", Color.GRAY, this));
        ss.add(RHS.createStringStack());
        ss.add("\n", this);
        return ss;
    }

    public Assignment(){
        LHS = new IncompleteSymbol();
        RHS = new IncompleteValue();
    }

    public void setLHS(Symbol s){
        this.LHS = s;
    }

    public void setRHS(IValue s){
        this.RHS = s;
    }
}
