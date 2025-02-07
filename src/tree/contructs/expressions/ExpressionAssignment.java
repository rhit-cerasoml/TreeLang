package tree.contructs.expressions;

import editor.model.TextCollection;
import tree.*;
import tree.terminals.symbol.ISymbol;
import tree.terminals.symbol.IncompleteSymbol;
import tree.terminals.symbol.Symbol;
import tree.terminals.expression.IExpression;
import tree.terminals.expression.IncompleteExpression;

public class ExpressionAssignment extends DefaultNode implements INode {
    ISymbol LHS;
    IExpression RHS;

    @Override
    public void createText(TextCollection collection) {
        collection.addText(LHS);
        collection.addText(" = ", this);
        collection.addText(RHS);
        collection.addText(";\n", this);
    }

    public ExpressionAssignment(){
        LHS = new IncompleteSymbol();
        RHS = new IncompleteExpression();
    }

    public void setLHS(Symbol s){
        this.LHS = s;
    }

    public void setRHS(IExpression s){
        this.RHS = s;
    }

    @Override
    public boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: assignment move");
        return false;
    }
}
