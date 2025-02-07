package tree.terminals.symbol;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;
import tree.contructs.expressions.ExpressionVariableDeclaration;
import tree.terminals.type.ITypeProvider;

import java.awt.*;

public class Symbol extends DefaultNode implements ISymbol {
    ExpressionVariableDeclaration declaration;
    String name;
    public Symbol(String name){
        this.name = name;
    }

    @Override

    public void createText(TextCollection collection) {
        collection.addText(name, getColor(), this);
    }

    @Override
    public boolean resolveMove(INode from, INode to) {
        System.out.println("TODO: symbol move");
        return false;
    }

    @Override
    public ITypeProvider resolveType() {
        return getDeclaration().resolveDeclaredType();
    }

    @Override
    public ExpressionVariableDeclaration getDeclaration() {
        return declaration;
    }

    @Override
    public void setDeclaration(ExpressionVariableDeclaration declaration) {
        this.declaration = declaration;
    }

    private Color getColor(){
        if(declaration == null){
            return Color.RED;
        }
        return declaration.getSymbolTypeColor();
    }
}
