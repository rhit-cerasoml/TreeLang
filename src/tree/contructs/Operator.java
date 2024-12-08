package tree.contructs;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.symbol.ISymbol;
import tree.terminals.value.IValue;
import treemodel.Primitives;

public class Operator extends DefaultNode implements INode, IValue {

    String operatorSymbol;
    ISymbol LHS;
    IValue RHS;
    public Operator(String operatorSymbol){
        this.operatorSymbol = operatorSymbol;
    }

    @Override
    public void createText(TextCollection collection) {
        collection.addText("(", this);
        LHS.createText(collection);
        collection.addText(operatorSymbol, this);
        RHS.createText(collection);
        collection.addText(")", this);
    }

    @Override
    public Type resolveType() {
        System.out.println("FIX THIS DUMMY");
        return null;//Primitives.PRIMITIVE_UNRESOLVED;
    }
}
