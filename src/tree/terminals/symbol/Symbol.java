package tree.terminals.symbol;

import editor.model.TextCollection;
import model.type.Type;
import tree.DefaultNode;
import tree.INode;
import tree.contructs.declarations.IDeclaration;
import tree.contructs.declarations.VariableDeclaration;

import java.awt.*;

public class Symbol extends DefaultNode implements ISymbol {
    IDeclaration declaration;
    String name;
    public Symbol(String name){
        this.name = name;
    }

    @Override

    public void createText(TextCollection collection) {
        collection.addText(name, getColor(), this);
    }

    @Override
    protected boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: symbol move");
        return false;
    }

    @Override
    public Type resolveType() {
        return getDeclaration().resolveDeclaredType();
    }

    @Override
    public IDeclaration getDeclaration() {
        return declaration;
    }

    @Override
    public void setDeclaration(IDeclaration declaration) {
        this.declaration = declaration;
    }

    private Color getColor(){
        if(declaration == null){
            return Color.RED;
        }
        return declaration.getSymbolTypeColor();
    }
}
