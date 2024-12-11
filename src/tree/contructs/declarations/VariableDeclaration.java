package tree.contructs.declarations;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.symbol.ISymbol;
import tree.terminals.symbol.IncompleteSymbol;
import tree.terminals.symbol.Symbol;
import treemodel.Primitives;

public class VariableDeclaration extends DefaultNode implements IDeclaration {
    ISymbol type;
    ISymbol symbol;

    @Override
    public void createText(TextCollection collection) {
        collection.addText(type);
        collection.addText(" ", this);
        collection.addText(symbol);
        collection.addText("\n", this);
    }

    public VariableDeclaration(){
        type = new IncompleteSymbol();
        symbol = new IncompleteSymbol();
    }

    public void setType(Symbol s){
        this.type = s;
    }

    public void setSymbol(Symbol s){
        // ASSIGN PARENT
        this.symbol = s;
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: declaration move");
        return false;
    }

    public Type resolveDeclaredType(){
        return type instanceof IncompleteSymbol ? Primitives.PRIMITIVE_UNRESOLVED : type.resolveType();
    }
}
