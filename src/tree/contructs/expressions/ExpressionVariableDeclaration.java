package tree.contructs.expressions;

import editor.model.TextCollection;
import tree.DefaultNode;
import tree.INode;
import tree.terminals.expression.IExpression;
import tree.terminals.symbol.ISymbol;
import tree.terminals.symbol.Symbol;
import tree.terminals.type.ITypeProvider;

import java.awt.*;

public class ExpressionVariableDeclaration extends DefaultNode implements IExpression {
    private ITypeProvider typeProvider;
    private String name;

    public ExpressionVariableDeclaration(ITypeProvider type, String name){
        this.typeProvider = type;
        this.name = name;
    }
    public ITypeProvider resolveDeclaredType() {
        return typeProvider;
    }
    public Color getSymbolTypeColor() {
        return Color.GRAY;
    }

    public ISymbol getSymbol(){
        Symbol symbol = new Symbol(name);
        symbol.setDeclaration(this);
        return symbol;
    }

    @Override
    public void createText(TextCollection collection) {
        collection.addText(typeProvider.resolve().toString(), this);
        collection.addText(" = ", this);
        collection.addText(name, this);
        collection.addText(";\n", this);
    }

    @Override
    public boolean resolveMove(INode from, INode to) {
        return false;
    }

    @Override
    public ITypeProvider resolveType() {
        return typeProvider;
    }
}
