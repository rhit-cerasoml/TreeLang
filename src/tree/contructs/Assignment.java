package tree.contructs;

import editor.model.TextCollection;
import tree.*;
import tree.terminals.symbol.ISymbol;
import tree.terminals.symbol.IncompleteSymbol;
import tree.terminals.symbol.Symbol;
import tree.terminals.value.IValue;
import tree.terminals.value.IncompleteValue;

public class Assignment extends DefaultNode implements INode {
    ISymbol LHS;
    IValue RHS;

    @Override
    public void createText(TextCollection collection) {
        collection.addText(LHS);
        collection.addText(" = ", this);
        collection.addText(RHS);
        collection.addText("\n", this);
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

    @Override
    protected boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: assignment move");
        return false;
    }
}
