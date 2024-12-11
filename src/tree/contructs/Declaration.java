package tree.contructs;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.symbol.IncompleteSymbol;
import tree.terminals.symbol.Symbol;

public class Declaration extends DefaultNode implements INode {
    INode type;
    INode symbol;

    @Override
    public void createText(TextCollection collection) {
        collection.addText(type);
        collection.addText(" ", this);
        collection.addText(symbol);
        collection.addText("\n", this);
    }

    public Declaration(){
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
}
