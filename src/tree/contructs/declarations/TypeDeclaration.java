package tree.contructs.declarations;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import tree.contructs.bodies.Body;
import tree.terminals.symbol.ISymbol;
import tree.terminals.symbol.IncompleteSymbol;

import java.awt.*;

public class TypeDeclaration extends DefaultNode implements IDeclaration {

    ISymbol name;
    Body body;

    public TypeDeclaration(){
        name = new IncompleteSymbol();
        body = new Body();
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: move type declaration");
        return false;
    }

    @Override
    public void createText(TextCollection collection) {
        collection.addText("class ", Color.CYAN, this);
        name.createText(collection);
        collection.addText(" ", this);
        body.createText(collection);
    }

    public void setName(ISymbol name){
        if(name.setParent(this)){
            this.name = name;
            name.setDeclaration(this);
        }
    }

    @Override
    public Type resolveDeclaredType() {
        return null;
    }

    @Override
    public Color getSymbolTypeColor() {
        return Color.PINK;
    }
}
